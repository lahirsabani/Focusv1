package app.fpp.model.views.useraccess.custremove;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 26 07:52:09 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppUserAreaRemChldLocViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LocationCode {
            public Object get(AppUserAreaRemChldLocViewRowImpl obj) {
                return obj.getLocationCode();
            }

            public void put(AppUserAreaRemChldLocViewRowImpl obj,
                            Object value) {
                obj.setLocationCode((String)value);
            }
        }
        ,
        UserName {
            public Object get(AppUserAreaRemChldLocViewRowImpl obj) {
                return obj.getUserName();
            }

            public void put(AppUserAreaRemChldLocViewRowImpl obj,
                            Object value) {
                obj.setUserName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(AppUserAreaRemChldLocViewRowImpl object);

        public abstract void put(AppUserAreaRemChldLocViewRowImpl object,
                                 Object value);

        public int index() {
            return firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return firstIndex() + staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = values();
            }
            return vals;
        }
    }

    public static final int LOCATIONCODE = AttributesEnum.LocationCode.index();
    public static final int USERNAME = AttributesEnum.UserName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppUserAreaRemChldLocViewRowImpl() {
    }

    /**
     * Gets AppUserLoc entity object.
     * @return the AppUserLoc
     */
    public EntityImpl getAppUserLoc() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets ArCustomers entity object.
     * @return the ArCustomers
     */
    public EntityImpl getArCustomers() {
        return (EntityImpl)getEntity(1);
    }

    /**
     * Gets the attribute value for LOCATION_CODE using the alias name LocationCode.
     * @return the LOCATION_CODE
     */
    public String getLocationCode() {
        return (String) getAttributeInternal(LOCATIONCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION_CODE using the alias name LocationCode.
     * @param value value to set the LOCATION_CODE
     */
    public void setLocationCode(String value) {
        setAttributeInternal(LOCATIONCODE, value);
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
