package app.fpp.model.views.confirmation;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 18 15:43:30 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getEmailUserApprovalHistoryRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActionBy {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getActionBy();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setActionBy((String)value);
            }
        }
        ,
        ProposalId {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getProposalId();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setProposalId((Number)value);
            }
        }
        ,
        Descr {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getDescr();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setDescr((String)value);
            }
        }
        ,
        FullName {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getFullName();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setFullName((String)value);
            }
        }
        ,
        Title {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getTitle();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        Action {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getAction();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setAction((String)value);
            }
        }
        ,
        DocApprovalId {
            public Object get(getEmailUserApprovalHistoryRowImpl obj) {
                return obj.getDocApprovalId();
            }

            public void put(getEmailUserApprovalHistoryRowImpl obj,
                            Object value) {
                obj.setDocApprovalId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(getEmailUserApprovalHistoryRowImpl object);

        public abstract void put(getEmailUserApprovalHistoryRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ACTIONBY = AttributesEnum.ActionBy.index();
    public static final int PROPOSALID = AttributesEnum.ProposalId.index();
    public static final int DESCR = AttributesEnum.Descr.index();
    public static final int FULLNAME = AttributesEnum.FullName.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int ACTION = AttributesEnum.Action.index();
    public static final int DOCAPPROVALID = AttributesEnum.DocApprovalId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public getEmailUserApprovalHistoryRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ProposalId.
     * @return the ProposalId
     */
    public Number getProposalId() {
        return (Number) getAttributeInternal(PROPOSALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProposalId.
     * @param value value to set the  ProposalId
     */
    public void setProposalId(Number value) {
        setAttributeInternal(PROPOSALID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActionBy.
     * @return the ActionBy
     */
    public String getActionBy() {
        return (String) getAttributeInternal(ACTIONBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActionBy.
     * @param value value to set the  ActionBy
     */
    public void setActionBy(String value) {
        setAttributeInternal(ACTIONBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Descr.
     * @return the Descr
     */
    public String getDescr() {
        return (String) getAttributeInternal(DESCR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Descr.
     * @param value value to set the  Descr
     */
    public void setDescr(String value) {
        setAttributeInternal(DESCR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FullName.
     * @return the FullName
     */
    public String getFullName() {
        return (String) getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FullName.
     * @param value value to set the  FullName
     */
    public void setFullName(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Title.
     * @return the Title
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Title.
     * @param value value to set the  Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Action.
     * @return the Action
     */
    public String getAction() {
        return (String) getAttributeInternal(ACTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Action.
     * @param value value to set the  Action
     */
    public void setAction(String value) {
        setAttributeInternal(ACTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocApprovalId.
     * @return the DocApprovalId
     */
    public Number getDocApprovalId() {
        return (Number) getAttributeInternal(DOCAPPROVALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocApprovalId.
     * @param value value to set the  DocApprovalId
     */
    public void setDocApprovalId(Number value) {
        setAttributeInternal(DOCAPPROVALID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
