package app.fpp.model.views.confirmation.dcv;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 23 17:29:37 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CheckCmRealisasiDcvImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CheckCmRealisasiDcvImpl() {
    }

    /**
     * Returns the bind variable value for noPp.
     * @return bind variable value for noPp
     */
    public String getnoPp() {
        return (String)getNamedWhereClauseParam("noPp");
    }

    /**
     * Sets <code>value</code> for bind variable noPp.
     * @param value value to bind as noPp
     */
    public void setnoPp(String value) {
        setNamedWhereClauseParam("noPp", value);
    }
}
