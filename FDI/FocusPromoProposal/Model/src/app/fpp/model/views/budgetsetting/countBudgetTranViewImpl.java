package app.fpp.model.views.budgetsetting;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 12 13:56:42 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class countBudgetTranViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public countBudgetTranViewImpl() {
    }


    /**
     * Returns the variable value for custId.
     * @return variable value for custId
     */
    public String getcustId() {
        return (String)ensureVariableManager().getVariableValue("custId");
    }

    /**
     * Sets <code>value</code> for variable custId.
     * @param value value to bind as custId
     */
    public void setcustId(String value) {
        ensureVariableManager().setVariableValue("custId", value);
    }
}