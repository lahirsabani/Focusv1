package app.fpp.model.am.client;

import app.fpp.model.am.common.PromoProposalAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 12 10:29:50 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PromoProposalAMClient extends ApplicationModuleImpl implements PromoProposalAM {
    /**
     * This is the default constructor (do not remove).
     */
    public PromoProposalAMClient() {
    }


    public void addDocApproval(String docNo, String docStatus,
                               String promoDtFrom, String promoDtTo,
                               String propRegion, String roleName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"addDocApproval",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {docNo, docStatus, promoDtFrom, promoDtTo, propRegion, roleName});
        return;
    }


    public void setLoginToSession_PromoProposalAM(String key, String val) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setLoginToSession_PromoProposalAM",new String [] {"java.lang.String","java.lang.String"},new Object[] {key, val});
        return;
    }

    public void addDocApproval(String propId, String docNo, String docStatus,
                               String promoDtFrom, String promoDtTo,
                               String docRegion, String usrRole, String userNm,
                               String aprvlFlowNm, String propDt) {
        Object _ret =
            this.riInvokeExportedMethod(this,"addDocApproval",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {propId, docNo, docStatus, promoDtFrom, promoDtTo, docRegion, usrRole, userNm, aprvlFlowNm, propDt});
        return;
    }

    public void cancelDocPp(String propId, String docNo, String docStatus,
                            String promoDtFrom, String promoDtTo,
                            String docRegion, String usrRole, String userNm,
                            String aprvlCodeRun, String idDocAprvl,
                            String cancelReason, String usrAction,
                            String propDt) {
        Object _ret =
            this.riInvokeExportedMethod(this,"cancelDocPp",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {propId, docNo, docStatus, promoDtFrom, promoDtTo, docRegion, usrRole, userNm, aprvlCodeRun, idDocAprvl, cancelReason, usrAction, propDt});
        return;
    }

    public void updateTargetUom(String ppid, String uomTarget) {
        Object _ret =
            this.riInvokeExportedMethod(this,"updateTargetUom",new String [] {"java.lang.String","java.lang.String"},new Object[] {ppid, uomTarget});
        return;
    }
}
