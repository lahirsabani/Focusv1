package app.fpp.model.views.useraccess.uploadfile.validate;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 24 11:39:10 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CheckRoleExistInApprovalFlowImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CheckRoleExistInApprovalFlowImpl() {
    }

    /**
     * Returns the bind variable value for aprvlNm.
     * @return bind variable value for aprvlNm
     */
    public String getaprvlNm() {
        return (String)getNamedWhereClauseParam("aprvlNm");
    }

    /**
     * Sets <code>value</code> for bind variable aprvlNm.
     * @param value value to bind as aprvlNm
     */
    public void setaprvlNm(String value) {
        setNamedWhereClauseParam("aprvlNm", value);
    }

    /**
     * Returns the bind variable value for roleNm.
     * @return bind variable value for roleNm
     */
    public String getroleNm() {
        return (String)getNamedWhereClauseParam("roleNm");
    }

    /**
     * Sets <code>value</code> for bind variable roleNm.
     * @param value value to bind as roleNm
     */
    public void setroleNm(String value) {
        setNamedWhereClauseParam("roleNm", value);
    }
}
