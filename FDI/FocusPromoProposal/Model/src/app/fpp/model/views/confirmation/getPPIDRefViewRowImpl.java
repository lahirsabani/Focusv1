package app.fpp.model.views.confirmation;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 26 16:37:16 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getPPIDRefViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PromoProdukId {
            public Object get(getPPIDRefViewRowImpl obj) {
                return obj.getPromoProdukId();
            }

            public void put(getPPIDRefViewRowImpl obj, Object value) {
                obj.setPromoProdukId((Number)value);
            }
        }
        ,
        PpidRef {
            public Object get(getPPIDRefViewRowImpl obj) {
                return obj.getPpidRef();
            }

            public void put(getPPIDRefViewRowImpl obj, Object value) {
                obj.setPpidRef((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(getPPIDRefViewRowImpl object);

        public abstract void put(getPPIDRefViewRowImpl object, Object value);

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
    public static final int PPIDREF = AttributesEnum.PpidRef.index();

    /**
     * This is the default constructor (do not remove).
     */
    public getPPIDRefViewRowImpl() {
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
     * Gets the attribute value for the calculated attribute PpidRef.
     * @return the PpidRef
     */
    public Number getPpidRef() {
        return (Number) getAttributeInternal(PPIDREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PpidRef.
     * @param value value to set the  PpidRef
     */
    public void setPpidRef(Number value) {
        setAttributeInternal(PPIDREF, value);
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
