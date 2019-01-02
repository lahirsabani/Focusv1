package app.fpp.model.views.useraccess.custremove;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 02 13:48:36 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppUserCustTypeRemPrntAreaViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AreaCode {
            public Object get(AppUserCustTypeRemPrntAreaViewRowImpl obj) {
                return obj.getAreaCode();
            }

            public void put(AppUserCustTypeRemPrntAreaViewRowImpl obj,
                            Object value) {
                obj.setAreaCode((String)value);
            }
        }
        ,
        UserName {
            public Object get(AppUserCustTypeRemPrntAreaViewRowImpl obj) {
                return obj.getUserName();
            }

            public void put(AppUserCustTypeRemPrntAreaViewRowImpl obj,
                            Object value) {
                obj.setUserName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(AppUserCustTypeRemPrntAreaViewRowImpl object);

        public abstract void put(AppUserCustTypeRemPrntAreaViewRowImpl object,
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
    public static final int AREACODE = AttributesEnum.AreaCode.index();
    public static final int USERNAME = AttributesEnum.UserName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppUserCustTypeRemPrntAreaViewRowImpl() {
    }

    /**
     * Gets AppUserArea entity object.
     * @return the AppUserArea
     */
    public EntityImpl getAppUserArea() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for AREA_CODE using the alias name AreaCode.
     * @return the AREA_CODE
     */
    public String getAreaCode() {
        return (String) getAttributeInternal(AREACODE);
    }

    /**
     * Sets <code>value</code> as attribute value for AREA_CODE using the alias name AreaCode.
     * @param value value to set the AREA_CODE
     */
    public void setAreaCode(String value) {
        setAttributeInternal(AREACODE, value);
    }

    /**
     * Gets the attribute value for USER_NAME using the alias name UserName.
     * @return the USER_NAME
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_NAME using the alias name UserName.
     * @param value value to set the USER_NAME
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
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
