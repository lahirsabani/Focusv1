package app.fpp.bean.promoproposal;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.domain.DBSequence;

public class PpProdAddItemBackingBean implements Serializable {

    // Shuttle operations
    @SuppressWarnings("compatibility:4429120787595570625")
    private static final long serialVersionUID = 1L;
    List selectedItems;
    List allItems;
    Boolean refreshSelectedList = false;
    private final String SELECTED_ITEM_ITERATOR =
        "ProdukItemView1Iterator";
    private final String ALL_ITEM_ITERATOR = 
        "AllProdukItemShuttleView1Iterator";
    
    public PpProdAddItemBackingBean() {
        super();
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setSelectedItems(List selectedItems) {
        this.selectedItems = selectedItems;
    }

    public List getSelectedItems() {

        if (selectedItems == null || refreshSelectedList) {
            selectedItems =
                    attributeListForIterator(SELECTED_ITEM_ITERATOR, "ProdItem");
        }
        return selectedItems;
    }

    public void setAllItems(List allItems) {
        this.allItems = allItems;
    }

    public List getAllItems() {
        if (allItems == null) {
            allItems = 
                selectItemsForIterator(ALL_ITEM_ITERATOR, "Item", "ItemDescription");
        }
        return allItems;
    }

    public void refreshSelectedList(ValueChangeEvent e) {
        refreshSelectedList = true;
    }

    // Shuttle operations
    
    public static List attributeListForIterator(String iteratorName,
                                                String valueAttrName) {
        BindingContext bc = BindingContext.getCurrent();
        DCBindingContainer binding =
            (DCBindingContainer)bc.getCurrentBindingsEntry();
        DCIteratorBinding iter = binding.findIteratorBinding(iteratorName);
        List attributeList = new ArrayList();
        for (Row r : iter.getAllRowsInRange()) {
            attributeList.add(r.getAttribute(valueAttrName));
        }
        return attributeList;
    }

    public static List<SelectItem> selectItemsForIterator(String iteratorName,
                                                          String valueAttrName,
                                                          String displayAttrName) {
        BindingContext bc = BindingContext.getCurrent();
        DCBindingContainer binding =
            (DCBindingContainer)bc.getCurrentBindingsEntry();
        DCIteratorBinding iter = binding.findIteratorBinding(iteratorName);
        List<SelectItem> selectItems = new ArrayList<SelectItem>();
        for (Row r : iter.getAllRowsInRange()) {
            selectItems.add(new SelectItem(r.getAttribute(valueAttrName),
                                           (String)r.getAttribute(displayAttrName)));
        }
        return selectItems;
    }

    public String processShuttle() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        String closeAfter = "close";
        BindingContext bctx = BindingContext.getCurrent();
        DCBindingContainer binding =
            (DCBindingContainer)bctx.getCurrentBindingsEntry();
        DCIteratorBinding iter =
            (DCIteratorBinding)binding.get(SELECTED_ITEM_ITERATOR);
        ADFContext adfCtx = ADFContext.getCurrent();
        Map pageFlowScope = adfCtx.getPageFlowScope();
        String valPpid = ((DBSequence)pageFlowScope.get("promoProdukId")).getSequenceNumber().toString();
        
        //Removing all rows
        for (Row r : iter.getAllRowsInRange()) {
            String selPpid = ((oracle.jbo.domain.Number)r.getAttribute("PromoProdukId")).getBigDecimalValue().toPlainString();
            if (valPpid.equalsIgnoreCase(selPpid)) {
                r.remove();
            }
        }

        if (this.getSelectedItems().size() > 0) {
            for (int i = 0; i < getSelectedItems().size(); i++) {
                Row row = iter.getRowSetIterator().createRow();
                row.setNewRowState(Row.STATUS_INITIALIZED);
                DCIteratorBinding iterAllVariant =
                    (DCIteratorBinding)binding.get(ALL_ITEM_ITERATOR);
                for (Row r : iterAllVariant.getAllRowsInRange()) {
                    if (getSelectedItems().get(i).equals(r.getAttribute("Item"))) {
                        row.setAttribute("ItemDesc",
                                         r.getAttribute("ItemDescription"));
                    }
                }
		row.setAttribute("PromoProdukId",getCurrentPromoProdukId().getValue());
                row.setAttribute("ProdItem", getSelectedItems().get(i));
                iter.getRowSetIterator().insertRow(row);
                iter.setCurrentRowWithKey(row.getKey().toStringFormat(true));
            }
        }
        
        String ok = doCommit();
        return closeAfter;
    }

    public String processCancel() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        String closeAfter = "close";
        //String cancel = doRollback();
        return closeAfter;
    }

    public String doCommit() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String doRollback() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public DBSequence getCurrentPromoProdukId() {
        ADFContext adfCtx = ADFContext.getCurrent();
        Map pageFlowScope = adfCtx.getPageFlowScope();
        DBSequence promoProdukId = (DBSequence)pageFlowScope.get("promoProdukId");
        return promoProdukId;
    }
}