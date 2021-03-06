package app.fpp.model.entities.confirmation.notifikasi;

import app.fpp.model.entities.promoproposal.ProposalImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 28 15:21:46 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmailNotifReceiverImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MnrId {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getMnrId();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setMnrId((DBSequence)value);
            }
        }
        ,
        ProposalId {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getProposalId();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setProposalId((Number)value);
            }
        }
        ,
        EmailAddress {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getEmailAddress();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setEmailAddress((String)value);
            }
        }
        ,
        UserName {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getUserName();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setUserName((String)value);
            }
        }
        ,
        FullName {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getFullName();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setFullName((String)value);
            }
        }
        ,
        MailCount {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getMailCount();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setMailCount((Number)value);
            }
        }
        ,
        SendDate {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getSendDate();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setSendDate((Date)value);
            }
        }
        ,
        Title {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getTitle();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        DocApprovalId {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getDocApprovalId();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setDocApprovalId((Number)value);
            }
        }
        ,
        Action {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getAction();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setAction((String)value);
            }
        }
        ,
        Proposal {
            public Object get(EmailNotifReceiverImpl obj) {
                return obj.getProposal();
            }

            public void put(EmailNotifReceiverImpl obj, Object value) {
                obj.setProposal((ProposalImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(EmailNotifReceiverImpl object);

        public abstract void put(EmailNotifReceiverImpl object, Object value);

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


    public static final int MNRID = AttributesEnum.MnrId.index();
    public static final int PROPOSALID = AttributesEnum.ProposalId.index();
    public static final int EMAILADDRESS = AttributesEnum.EmailAddress.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int FULLNAME = AttributesEnum.FullName.index();
    public static final int MAILCOUNT = AttributesEnum.MailCount.index();
    public static final int SENDDATE = AttributesEnum.SendDate.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int DOCAPPROVALID = AttributesEnum.DocApprovalId.index();
    public static final int ACTION = AttributesEnum.Action.index();
    public static final int PROPOSAL = AttributesEnum.Proposal.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmailNotifReceiverImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("app.fpp.model.entities.confirmation.notifikasi.EmailNotifReceiver");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for MnrId, using the alias name MnrId.
     * @return the MnrId
     */
    public DBSequence getMnrId() {
        return (DBSequence)getAttributeInternal(MNRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MnrId.
     * @param value value to set the MnrId
     */
    public void setMnrId(DBSequence value) {
        setAttributeInternal(MNRID, value);
    }

    /**
     * Gets the attribute value for ProposalId, using the alias name ProposalId.
     * @return the ProposalId
     */
    public Number getProposalId() {
        return (Number)getAttributeInternal(PROPOSALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProposalId.
     * @param value value to set the ProposalId
     */
    public void setProposalId(Number value) {
        setAttributeInternal(PROPOSALID, value);
    }

    /**
     * Gets the attribute value for EmailAddress, using the alias name EmailAddress.
     * @return the EmailAddress
     */
    public String getEmailAddress() {
        return (String)getAttributeInternal(EMAILADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmailAddress.
     * @param value value to set the EmailAddress
     */
    public void setEmailAddress(String value) {
        setAttributeInternal(EMAILADDRESS, value);
    }

    /**
     * Gets the attribute value for UserName, using the alias name UserName.
     * @return the UserName
     */
    public String getUserName() {
        return (String)getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserName.
     * @param value value to set the UserName
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for FullName, using the alias name FullName.
     * @return the FullName
     */
    public String getFullName() {
        return (String)getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FullName.
     * @param value value to set the FullName
     */
    public void setFullName(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for MailCount, using the alias name MailCount.
     * @return the MailCount
     */
    public Number getMailCount() {
        return (Number)getAttributeInternal(MAILCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for MailCount.
     * @param value value to set the MailCount
     */
    public void setMailCount(Number value) {
        setAttributeInternal(MAILCOUNT, value);
    }

    /**
     * Gets the attribute value for SendDate, using the alias name SendDate.
     * @return the SendDate
     */
    public Date getSendDate() {
        return (Date)getAttributeInternal(SENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SendDate.
     * @param value value to set the SendDate
     */
    public void setSendDate(Date value) {
        setAttributeInternal(SENDDATE, value);
    }

    /**
     * Gets the attribute value for Title, using the alias name Title.
     * @return the Title
     */
    public String getTitle() {
        return (String)getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Title.
     * @param value value to set the Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for DocApprovalId, using the alias name DocApprovalId.
     * @return the DocApprovalId
     */
    public Number getDocApprovalId() {
        return (Number)getAttributeInternal(DOCAPPROVALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocApprovalId.
     * @param value value to set the DocApprovalId
     */
    public void setDocApprovalId(Number value) {
        setAttributeInternal(DOCAPPROVALID, value);
    }

    /**
     * Gets the attribute value for Action, using the alias name Action.
     * @return the Action
     */
    public String getAction() {
        return (String)getAttributeInternal(ACTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Action.
     * @param value value to set the Action
     */
    public void setAction(String value) {
        setAttributeInternal(ACTION, value);
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

    /**
     * @return the associated entity app.fpp.model.entities.promoproposal.ProposalImpl.
     */
    public ProposalImpl getProposal() {
        return (ProposalImpl)getAttributeInternal(PROPOSAL);
    }

    /**
     * Sets <code>value</code> as the associated entity app.fpp.model.entities.promoproposal.ProposalImpl.
     */
    public void setProposal(ProposalImpl value) {
        setAttributeInternal(PROPOSAL, value);
    }


    /**
     * @param mnrId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence mnrId) {
        return new Key(new Object[]{mnrId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
         super.create(attributeList);
         SequenceImpl seq = new SequenceImpl("EMAIL_NOTIF_RECEIVER_SEQ", getDBTransaction());
         this.setMnrId(new DBSequence(seq.getSequenceNumber()));
     }
}
