package app.fpp.model.views.confirmation;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 26 16:37:16 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getPPIDRefViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public getPPIDRefViewImpl() {
    }

    /**
     * Returns the bind variable value for promoProduk.
     * @return bind variable value for promoProduk
     */
    public String getpromoProduk() {
        return (String)getNamedWhereClauseParam("promoProduk");
    }

    /**
     * Sets <code>value</code> for bind variable promoProduk.
     * @param value value to bind as promoProduk
     */
    public void setpromoProduk(String value) {
        setNamedWhereClauseParam("promoProduk", value);
    }
}
