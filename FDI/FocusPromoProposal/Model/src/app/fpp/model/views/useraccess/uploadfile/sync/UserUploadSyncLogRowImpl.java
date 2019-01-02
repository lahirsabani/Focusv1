package app.fpp.model.views.useraccess.uploadfile.sync;

import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 15 17:43:26 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserUploadSyncLogRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SyncStatus {
            public Object get(UserUploadSyncLogRowImpl obj) {
                return obj.getSyncStatus();
            }

            public void put(UserUploadSyncLogRowImpl obj, Object value) {
                obj.setSyncStatus((String)value);
            }
        }
        ,
        SyncExecDate {
            public Object get(UserUploadSyncLogRowImpl obj) {
                return obj.getSyncExecDate();
            }

            public void put(UserUploadSyncLogRowImpl obj, Object value) {
                obj.setSyncExecDate((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(UserUploadSyncLogRowImpl object);

        public abstract void put(UserUploadSyncLogRowImpl object,
                                 Object value);

        public int index() {
            return UserUploadSyncLogRowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return UserUploadSyncLogRowImpl.AttributesEnum.firstIndex() + UserUploadSyncLogRowImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = UserUploadSyncLogRowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int SYNCSTATUS = AttributesEnum.SyncStatus.index();
    public static final int SYNCEXECDATE = AttributesEnum.SyncExecDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserUploadSyncLogRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SyncStatus.
     * @return the SyncStatus
     */
    public String getSyncStatus() {
        return (String) getAttributeInternal(SYNCSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SyncStatus.
     * @param value value to set the  SyncStatus
     */
    public void setSyncStatus(String value) {
        setAttributeInternal(SYNCSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SyncExecDate.
     * @return the SyncExecDate
     */
    public Date getSyncExecDate() {
        return (Date) getAttributeInternal(SYNCEXECDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SyncExecDate.
     * @param value value to set the  SyncExecDate
     */
    public void setSyncExecDate(Date value) {
        setAttributeInternal(SYNCEXECDATE, value);
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
