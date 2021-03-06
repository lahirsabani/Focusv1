package app.fpp.model.views.promoproposal.copyaddendum;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 27 10:29:53 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CopyCustPropRegionCustomerViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProposalId {
            public Object get(CopyCustPropRegionCustomerViewRowImpl obj) {
                return obj.getProposalId();
            }

            public void put(CopyCustPropRegionCustomerViewRowImpl obj,
                            Object value) {
                obj.setProposalId((Number)value);
            }
        }
        ,
        CustomerId {
            public Object get(CopyCustPropRegionCustomerViewRowImpl obj) {
                return obj.getCustomerId();
            }

            public void put(CopyCustPropRegionCustomerViewRowImpl obj,
                            Object value) {
                obj.setCustomerId((Number)value);
            }
        }
        ,
        Custdescription {
            public Object get(CopyCustPropRegionCustomerViewRowImpl obj) {
                return obj.getCustdescription();
            }

            public void put(CopyCustPropRegionCustomerViewRowImpl obj,
                            Object value) {
                obj.setCustdescription((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CopyCustPropRegionCustomerViewRowImpl object);

        public abstract void put(CopyCustPropRegionCustomerViewRowImpl object,
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
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTDESCRIPTION = AttributesEnum.Custdescription.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CopyCustPropRegionCustomerViewRowImpl() {
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
     * Gets the attribute value for the calculated attribute CustomerId.
     * @return the CustomerId
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustomerId.
     * @param value value to set the  CustomerId
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Custdescription.
     * @return the Custdescription
     */
    public String getCustdescription() {
        return (String) getAttributeInternal(CUSTDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Custdescription.
     * @param value value to set the  Custdescription
     */
    public void setCustdescription(String value) {
        setAttributeInternal(CUSTDESCRIPTION, value);
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
