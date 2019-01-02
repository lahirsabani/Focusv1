package app.fpp.model.views.useraccess.uploadfile.sync;

import app.fpp.model.entities.useraccess.AppUserAccessImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 24 16:07:35 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UpdateAppUserAccessRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActivePeriodFrom {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getActivePeriodFrom();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setActivePeriodFrom((Date)value);
            }
        }
        ,
        ActivePeriodTo {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getActivePeriodTo();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setActivePeriodTo((Date)value);
            }
        }
        ,
        CompanyId {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getCompanyId();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setCompanyId((String)value);
            }
        }
        ,
        ContactNo {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getContactNo();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setContactNo((String)value);
            }
        }
        ,
        Descr {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getDescr();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setDescr((String)value);
            }
        }
        ,
        DirectSpv {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getDirectSpv();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setDirectSpv((String)value);
            }
        }
        ,
        FullName {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getFullName();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setFullName((String)value);
            }
        }
        ,
        Id {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getId();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setId((DBSequence)value);
            }
        }
        ,
        Password {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getPassword();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setPassword((String)value);
            }
        }
        ,
        Title {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getTitle();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        UserDivision {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUserDivision();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setUserDivision((String)value);
            }
        }
        ,
        UserInitial {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUserInitial();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setUserInitial((String)value);
            }
        }
        ,
        UserName {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUserName();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setUserName((String)value);
            }
        }
        ,
        UserType {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUserType();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setUserType((String)value);
            }
        }
        ,
        CustAuthFlag {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getCustAuthFlag();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setCustAuthFlag((String)value);
            }
        }
        ,
        UpdateAppUserAccessRoles {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserAccessRoles();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserRegion {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserRegion();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserLoc {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserLoc();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserArea {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserArea();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserCustType {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserCustType();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserCustGroup {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserCustGroup();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserCust {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserCust();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukBrand {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukBrand();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukCategory {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukCategory();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukExt {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukExt();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukItem {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukItem();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukPack {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukPack();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukVariant {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukVariant();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UpdateAppUserProdukClass {
            public Object get(UpdateAppUserAccessRowImpl obj) {
                return obj.getUpdateAppUserProdukClass();
            }

            public void put(UpdateAppUserAccessRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(UpdateAppUserAccessRowImpl object);

        public abstract void put(UpdateAppUserAccessRowImpl object,
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


    public static final int ACTIVEPERIODFROM = AttributesEnum.ActivePeriodFrom.index();
    public static final int ACTIVEPERIODTO = AttributesEnum.ActivePeriodTo.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int CONTACTNO = AttributesEnum.ContactNo.index();
    public static final int DESCR = AttributesEnum.Descr.index();
    public static final int DIRECTSPV = AttributesEnum.DirectSpv.index();
    public static final int FULLNAME = AttributesEnum.FullName.index();
    public static final int ID = AttributesEnum.Id.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int USERDIVISION = AttributesEnum.UserDivision.index();
    public static final int USERINITIAL = AttributesEnum.UserInitial.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int USERTYPE = AttributesEnum.UserType.index();
    public static final int CUSTAUTHFLAG = AttributesEnum.CustAuthFlag.index();
    public static final int UPDATEAPPUSERACCESSROLES = AttributesEnum.UpdateAppUserAccessRoles.index();
    public static final int UPDATEAPPUSERREGION = AttributesEnum.UpdateAppUserRegion.index();
    public static final int UPDATEAPPUSERLOC = AttributesEnum.UpdateAppUserLoc.index();
    public static final int UPDATEAPPUSERAREA = AttributesEnum.UpdateAppUserArea.index();
    public static final int UPDATEAPPUSERCUSTTYPE = AttributesEnum.UpdateAppUserCustType.index();
    public static final int UPDATEAPPUSERCUSTGROUP = AttributesEnum.UpdateAppUserCustGroup.index();
    public static final int UPDATEAPPUSERCUST = AttributesEnum.UpdateAppUserCust.index();
    public static final int UPDATEAPPUSERPRODUKBRAND = AttributesEnum.UpdateAppUserProdukBrand.index();
    public static final int UPDATEAPPUSERPRODUKCATEGORY = AttributesEnum.UpdateAppUserProdukCategory.index();
    public static final int UPDATEAPPUSERPRODUKEXT = AttributesEnum.UpdateAppUserProdukExt.index();
    public static final int UPDATEAPPUSERPRODUKITEM = AttributesEnum.UpdateAppUserProdukItem.index();
    public static final int UPDATEAPPUSERPRODUKPACK = AttributesEnum.UpdateAppUserProdukPack.index();
    public static final int UPDATEAPPUSERPRODUKVARIANT = AttributesEnum.UpdateAppUserProdukVariant.index();
    public static final int UPDATEAPPUSERPRODUKCLASS = AttributesEnum.UpdateAppUserProdukClass.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UpdateAppUserAccessRowImpl() {
    }

    /**
     * Gets AppUserAccess entity object.
     * @return the AppUserAccess
     */
    public AppUserAccessImpl getAppUserAccess() {
        return (AppUserAccessImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ACTIVE_PERIOD_FROM using the alias name ActivePeriodFrom.
     * @return the ACTIVE_PERIOD_FROM
     */
    public Date getActivePeriodFrom() {
        return (Date) getAttributeInternal(ACTIVEPERIODFROM);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_PERIOD_FROM using the alias name ActivePeriodFrom.
     * @param value value to set the ACTIVE_PERIOD_FROM
     */
    public void setActivePeriodFrom(Date value) {
        setAttributeInternal(ACTIVEPERIODFROM, value);
    }

    /**
     * Gets the attribute value for ACTIVE_PERIOD_TO using the alias name ActivePeriodTo.
     * @return the ACTIVE_PERIOD_TO
     */
    public Date getActivePeriodTo() {
        return (Date) getAttributeInternal(ACTIVEPERIODTO);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_PERIOD_TO using the alias name ActivePeriodTo.
     * @param value value to set the ACTIVE_PERIOD_TO
     */
    public void setActivePeriodTo(Date value) {
        setAttributeInternal(ACTIVEPERIODTO, value);
    }

    /**
     * Gets the attribute value for COMPANY_ID using the alias name CompanyId.
     * @return the COMPANY_ID
     */
    public String getCompanyId() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_ID using the alias name CompanyId.
     * @param value value to set the COMPANY_ID
     */
    public void setCompanyId(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for CONTACT_NO using the alias name ContactNo.
     * @return the CONTACT_NO
     */
    public String getContactNo() {
        return (String) getAttributeInternal(CONTACTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTACT_NO using the alias name ContactNo.
     * @param value value to set the CONTACT_NO
     */
    public void setContactNo(String value) {
        setAttributeInternal(CONTACTNO, value);
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
     * Gets the attribute value for DIRECT_SPV using the alias name DirectSpv.
     * @return the DIRECT_SPV
     */
    public String getDirectSpv() {
        return (String) getAttributeInternal(DIRECTSPV);
    }

    /**
     * Sets <code>value</code> as attribute value for DIRECT_SPV using the alias name DirectSpv.
     * @param value value to set the DIRECT_SPV
     */
    public void setDirectSpv(String value) {
        setAttributeInternal(DIRECTSPV, value);
    }

    /**
     * Gets the attribute value for FULL_NAME using the alias name FullName.
     * @return the FULL_NAME
     */
    public String getFullName() {
        return (String) getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FULL_NAME using the alias name FullName.
     * @param value value to set the FULL_NAME
     */
    public void setFullName(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public DBSequence getId() {
        return (DBSequence)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(DBSequence value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for PASSWORD using the alias name Password.
     * @return the PASSWORD
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSWORD using the alias name Password.
     * @param value value to set the PASSWORD
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
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
     * Gets the attribute value for USER_DIVISION using the alias name UserDivision.
     * @return the USER_DIVISION
     */
    public String getUserDivision() {
        return (String) getAttributeInternal(USERDIVISION);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_DIVISION using the alias name UserDivision.
     * @param value value to set the USER_DIVISION
     */
    public void setUserDivision(String value) {
        setAttributeInternal(USERDIVISION, value);
    }

    /**
     * Gets the attribute value for USER_INITIAL using the alias name UserInitial.
     * @return the USER_INITIAL
     */
    public String getUserInitial() {
        return (String) getAttributeInternal(USERINITIAL);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_INITIAL using the alias name UserInitial.
     * @param value value to set the USER_INITIAL
     */
    public void setUserInitial(String value) {
        setAttributeInternal(USERINITIAL, value);
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
     * Gets the attribute value for USER_TYPE using the alias name UserType.
     * @return the USER_TYPE
     */
    public String getUserType() {
        return (String) getAttributeInternal(USERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_TYPE using the alias name UserType.
     * @param value value to set the USER_TYPE
     */
    public void setUserType(String value) {
        setAttributeInternal(USERTYPE, value);
    }

    /**
     * Gets the attribute value for CUST_AUTH_FLAG using the alias name CustAuthFlag.
     * @return the CUST_AUTH_FLAG
     */
    public String getCustAuthFlag() {
        return (String) getAttributeInternal(CUSTAUTHFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_AUTH_FLAG using the alias name CustAuthFlag.
     * @param value value to set the CUST_AUTH_FLAG
     */
    public void setCustAuthFlag(String value) {
        setAttributeInternal(CUSTAUTHFLAG, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserAccessRoles.
     */
    public RowIterator getUpdateAppUserAccessRoles() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERACCESSROLES);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserRegion.
     */
    public RowIterator getUpdateAppUserRegion() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERREGION);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserLoc.
     */
    public RowIterator getUpdateAppUserLoc() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERLOC);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserArea.
     */
    public RowIterator getUpdateAppUserArea() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERAREA);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserCustType.
     */
    public RowIterator getUpdateAppUserCustType() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERCUSTTYPE);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserCustGroup.
     */
    public RowIterator getUpdateAppUserCustGroup() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERCUSTGROUP);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserCust.
     */
    public RowIterator getUpdateAppUserCust() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERCUST);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukBrand.
     */
    public RowIterator getUpdateAppUserProdukBrand() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKBRAND);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukCategory.
     */
    public RowIterator getUpdateAppUserProdukCategory() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKCATEGORY);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukExt.
     */
    public RowIterator getUpdateAppUserProdukExt() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKEXT);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukItem.
     */
    public RowIterator getUpdateAppUserProdukItem() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKITEM);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukPack.
     */
    public RowIterator getUpdateAppUserProdukPack() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKPACK);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukVariant.
     */
    public RowIterator getUpdateAppUserProdukVariant() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKVARIANT);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UpdateAppUserProdukClass.
     */
    public RowIterator getUpdateAppUserProdukClass() {
        return (RowIterator)getAttributeInternal(UPDATEAPPUSERPRODUKCLASS);
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
