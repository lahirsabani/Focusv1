package app.fpp.model.views.approval;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 19 16:01:01 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ApprovalForwardReceiverProposalViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ApprovalForwardReceiverProposalViewImpl() {
    }

    /**
     * Returns the bind variable value for userName.
     * @return bind variable value for userName
     */
    public String getuserName() {
        return (String)getNamedWhereClauseParam("userName");
    }

    /**
     * Sets <code>value</code> for bind variable userName.
     * @param value value to bind as userName
     */
    public void setuserName(String value) {
        setNamedWhereClauseParam("userName", value);
    }
}
