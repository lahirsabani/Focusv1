package app.fpp.model.views.promoproposal.duplicate;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 15 11:50:20 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DuplicateProdExclRegionViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PromoProdukId {
            public Object get(DuplicateProdExclRegionViewRowImpl obj) {
                return obj.getPromoProdukId();
            }

            public void put(DuplicateProdExclRegionViewRowImpl obj,
                            Object value) {
                obj.setPromoProdukId((Number)value);
            }
        }
        ,
        RegionCode {
            public Object get(DuplicateProdExclRegionViewRowImpl obj) {
                return obj.getRegionCode();
            }

            public void put(DuplicateProdExclRegionViewRowImpl obj,
                            Object value) {
                obj.setRegionCode((String)value);
            }
        }
        ,
        Notes {
            public Object get(DuplicateProdExclRegionViewRowImpl obj) {
                return obj.getNotes();
            }

            public void put(DuplicateProdExclRegionViewRowImpl obj,
                            Object value) {
                obj.setNotes((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(DuplicateProdExclRegionViewRowImpl object);

        public abstract void put(DuplicateProdExclRegionViewRowImpl object,
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


    public static final int PROMOPRODUKID = AttributesEnum.PromoProdukId.index();
    public static final int REGIONCODE = AttributesEnum.RegionCode.index();
    public static final int NOTES = AttributesEnum.Notes.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DuplicateProdExclRegionViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute PromoProdukId.
     * @return the PromoProdukId
     */
    public Number getPromoProdukId() {
        return (Number) getAttributeInternal(PROMOPRODUKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PromoProdukId.
     * @param value value to set the  PromoProdukId
     */
    public void setPromoProdukId(Number value) {
        setAttributeInternal(PROMOPRODUKID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RegionCode.
     * @return the RegionCode
     */
    public String getRegionCode() {
        return (String) getAttributeInternal(REGIONCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RegionCode.
     * @param value value to set the  RegionCode
     */
    public void setRegionCode(String value) {
        setAttributeInternal(REGIONCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Notes.
     * @return the Notes
     */
    public String getNotes() {
        return (String) getAttributeInternal(NOTES);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Notes.
     * @param value value to set the  Notes
     */
    public void setNotes(String value) {
        setAttributeInternal(NOTES, value);
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
