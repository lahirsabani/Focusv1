package app.fpp.model.views.masterdata.lov.customer;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 17 12:37:06 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustAreaFindParentViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CustAreaFindParentViewImpl() {
    }

    /**
     * Returns the bind variable value for areaCode.
     * @return bind variable value for areaCode
     */
    public String getareaCode() {
        return (String)getNamedWhereClauseParam("areaCode");
    }

    /**
     * Sets <code>value</code> for bind variable areaCode.
     * @param value value to bind as areaCode
     */
    public void setareaCode(String value) {
        setNamedWhereClauseParam("areaCode", value);
    }
}