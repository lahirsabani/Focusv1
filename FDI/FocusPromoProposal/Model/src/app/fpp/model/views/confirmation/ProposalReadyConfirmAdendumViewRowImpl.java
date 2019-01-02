package app.fpp.model.views.confirmation;

import app.fpp.model.entities.promoproposal.ProposalImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 25 15:06:33 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProposalReadyConfirmAdendumViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProposalId {
            public Object get(ProposalReadyConfirmAdendumViewRowImpl obj) {
                return obj.getProposalId();
            }

            public void put(ProposalReadyConfirmAdendumViewRowImpl obj,
                            Object value) {
                obj.setProposalId((DBSequence)value);
            }
        }
        ,
        ProposalNo {
            public Object get(ProposalReadyConfirmAdendumViewRowImpl obj) {
                return obj.getProposalNo();
            }

            public void put(ProposalReadyConfirmAdendumViewRowImpl obj,
                            Object value) {
                obj.setProposalNo((String)value);
            }
        }
        ,
        Pemohon {
            public Object get(ProposalReadyConfirmAdendumViewRowImpl obj) {
                return obj.getPemohon();
            }

            public void put(ProposalReadyConfirmAdendumViewRowImpl obj,
                            Object value) {
                obj.setPemohon((String)value);
            }
        }
        ,
        ConfirmNo {
            public Object get(ProposalReadyConfirmAdendumViewRowImpl obj) {
                return obj.getConfirmNo();
            }

            public void put(ProposalReadyConfirmAdendumViewRowImpl obj,
                            Object value) {
                obj.setConfirmNo((String)value);
            }
        }
        ,
        CopySource {
            public Object get(ProposalReadyConfirmAdendumViewRowImpl obj) {
                return obj.getCopySource();
            }

            public void put(ProposalReadyConfirmAdendumViewRowImpl obj,
                            Object value) {
                obj.setCopySource((String)value);
            }
        }
        ,
        UserAccessLov {
            public Object get(ProposalReadyConfirmAdendumViewRowImpl obj) {
                return obj.getUserAccessLov();
            }

            public void put(ProposalReadyConfirmAdendumViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ProposalReadyConfirmAdendumViewRowImpl object);

        public abstract void put(ProposalReadyConfirmAdendumViewRowImpl object,
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

    public static final int PROPOSALID = AttributesEnum.ProposalId.index();
    public static final int PROPOSALNO = AttributesEnum.ProposalNo.index();
    public static final int PEMOHON = AttributesEnum.Pemohon.index();
    public static final int CONFIRMNO = AttributesEnum.ConfirmNo.index();
    public static final int COPYSOURCE = AttributesEnum.CopySource.index();
    public static final int USERACCESSLOV = AttributesEnum.UserAccessLov.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProposalReadyConfirmAdendumViewRowImpl() {
    }

    /**
     * Gets Proposal entity object.
     * @return the Proposal
     */
    public ProposalImpl getProposal() {
        return (ProposalImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for PROPOSAL_ID using the alias name ProposalId.
     * @return the PROPOSAL_ID
     */
    public DBSequence getProposalId() {
        return (DBSequence)getAttributeInternal(PROPOSALID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROPOSAL_ID using the alias name ProposalId.
     * @param value value to set the PROPOSAL_ID
     */
    public void setProposalId(DBSequence value) {
        setAttributeInternal(PROPOSALID, value);
    }

    /**
     * Gets the attribute value for PROPOSAL_NO using the alias name ProposalNo.
     * @return the PROPOSAL_NO
     */
    public String getProposalNo() {
        return (String) getAttributeInternal(PROPOSALNO);
    }

    /**
     * Sets <code>value</code> as attribute value for PROPOSAL_NO using the alias name ProposalNo.
     * @param value value to set the PROPOSAL_NO
     */
    public void setProposalNo(String value) {
        setAttributeInternal(PROPOSALNO, value);
    }

    /**
     * Gets the attribute value for PEMOHON using the alias name Pemohon.
     * @return the PEMOHON
     */
    public String getPemohon() {
        return (String) getAttributeInternal(PEMOHON);
    }

    /**
     * Sets <code>value</code> as attribute value for PEMOHON using the alias name Pemohon.
     * @param value value to set the PEMOHON
     */
    public void setPemohon(String value) {
        setAttributeInternal(PEMOHON, value);
    }

    /**
     * Gets the attribute value for CONFIRM_NO using the alias name ConfirmNo.
     * @return the CONFIRM_NO
     */
    public String getConfirmNo() {
        return (String) getAttributeInternal(CONFIRMNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CONFIRM_NO using the alias name ConfirmNo.
     * @param value value to set the CONFIRM_NO
     */
    public void setConfirmNo(String value) {
        setAttributeInternal(CONFIRMNO, value);
    }

    /**
     * Gets the attribute value for COPY_SOURCE using the alias name CopySource.
     * @return the COPY_SOURCE
     */
    public String getCopySource() {
        return (String) getAttributeInternal(COPYSOURCE);
    }

    /**
     * Sets <code>value</code> as attribute value for COPY_SOURCE using the alias name CopySource.
     * @param value value to set the COPY_SOURCE
     */
    public void setCopySource(String value) {
        setAttributeInternal(COPYSOURCE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UserAccessLov.
     */
    public RowSet getUserAccessLov() {
        return (RowSet)getAttributeInternal(USERACCESSLOV);
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