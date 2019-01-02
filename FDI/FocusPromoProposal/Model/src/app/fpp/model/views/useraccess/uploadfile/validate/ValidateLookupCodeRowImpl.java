package app.fpp.model.views.useraccess.uploadfile.validate;

import app.fpp.model.entities.masterdata.LookupCodeImpl;

import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 10 16:26:23 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ValidateLookupCodeRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Descr {
            public Object get(ValidateLookupCodeRowImpl obj) {
                return obj.getDescr();
            }

            public void put(ValidateLookupCodeRowImpl obj, Object value) {
                obj.setDescr((String)value);
            }
        }
        ,
        LookupId {
            public Object get(ValidateLookupCodeRowImpl obj) {
                return obj.getLookupId();
            }

            public void put(ValidateLookupCodeRowImpl obj, Object value) {
                obj.setLookupId((DBSequence)value);
            }
        }
        ,
        Title {
            public Object get(ValidateLookupCodeRowImpl obj) {
                return obj.getTitle();
            }

            public void put(ValidateLookupCodeRowImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        Value {
            public Object get(ValidateLookupCodeRowImpl obj) {
                return obj.getValue();
            }

            public void put(ValidateLookupCodeRowImpl obj, Object value) {
                obj.setValue((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ValidateLookupCodeRowImpl object);

        public abstract void put(ValidateLookupCodeRowImpl object,
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
    public static final int DESCR = AttributesEnum.Descr.index();
    public static final int LOOKUPID = AttributesEnum.LookupId.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int VALUE = AttributesEnum.Value.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ValidateLookupCodeRowImpl() {
    }

    /**
     * Gets LookupCode entity object.
     * @return the LookupCode
     */
    public LookupCodeImpl getLookupCode() {
        return (LookupCodeImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for DESCR using the alias name Descr.
     * @return the DESCR
     */
    public String getDescr() {
        return (String) getAttributeInternal(DESCR);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCR using the alias name Descr.
     * @param value value to set the DESCR
     */
    public void setDescr(String value) {
        setAttributeInternal(DESCR, value);
    }

    /**
     * Gets the attribute value for LOOKUP_ID using the alias name LookupId.
     * @return the LOOKUP_ID
     */
    public DBSequence getLookupId() {
        return (DBSequence)getAttributeInternal(LOOKUPID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOOKUP_ID using the alias name LookupId.
     * @param value value to set the LOOKUP_ID
     */
    public void setLookupId(DBSequence value) {
        setAttributeInternal(LOOKUPID, value);
    }

    /**
     * Gets the attribute value for TITLE using the alias name Title.
     * @return the TITLE
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as attribute value for TITLE using the alias name Title.
     * @param value value to set the TITLE
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for VALUE using the alias name Value.
     * @return the VALUE
     */
    public String getValue() {
        return (String) getAttributeInternal(VALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for VALUE using the alias name Value.
     * @param value value to set the VALUE
     */
    public void setValue(String value) {
        setAttributeInternal(VALUE, value);
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
