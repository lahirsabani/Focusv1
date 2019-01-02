package app.fpp.model.am;

import app.fpp.adfextensions.CustomApplicationModuleImpl;
import app.fpp.model.am.common.ConfirmationAM;
import app.fpp.model.views.confirmation.CancelConfirmationClearBudgetViewImpl;
import app.fpp.model.views.confirmation.CategoryPcLogViewImpl;
import app.fpp.model.views.confirmation.ProdBudgetByCustViewImpl;
import app.fpp.model.views.confirmation.ProdBudgetByPostViewImpl;
import app.fpp.model.views.confirmation.ProdRealSummaryViewImpl;
import app.fpp.model.views.confirmation.PromoProdukLineClosedViewImpl;
import app.fpp.model.views.confirmation.ProposalConfirmationViewImpl;
import app.fpp.model.views.confirmation.ProposalForAdendumViewImpl;
import app.fpp.model.views.confirmation.ProposalReadyConfirmAdendumViewImpl;
import app.fpp.model.views.confirmation.ProposalUpdateConfirmAdendumViewImpl;
import app.fpp.model.views.confirmation.ProposalUpdatePrCreatedViewImpl;
import app.fpp.model.views.confirmation.RealisasiItemPaketViewImpl;
import app.fpp.model.views.confirmation.checkAddendumBudgetClearViewImpl;
import app.fpp.model.views.confirmation.checkOverBudgetClearViewImpl;
import app.fpp.model.views.confirmation.checkProdukApprovalModifierOnInImpl;
import app.fpp.model.views.confirmation.dcv.CheckCmRealisasiDcvImpl;
import app.fpp.model.views.confirmation.dcv.CheckRealisasiSalesOrderImpl;
import app.fpp.model.views.confirmation.dcv.CloseValidationDcvAmountImpl;
import app.fpp.model.views.confirmation.getEmailUserApprovalHistoryImpl;
import app.fpp.model.views.confirmation.getPPIDRefViewImpl;
import app.fpp.model.views.confirmation.getPPorPCViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsModifierAreaExclViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsModifierAreaViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsModifierCeckBucketItemCategoryImpl;
import app.fpp.model.views.confirmation.modifier.FcsModifierHoExclViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsModifierHoViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsQpModifierTempExclViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsQpModifierTempViewImpl;
import app.fpp.model.views.confirmation.modifier.FcsViewNoModifierViewImpl;
import app.fpp.model.views.confirmation.modifier.HeaderIdSeqViewImpl;
import app.fpp.model.views.confirmation.targetpr.FcsApprovalPathViewImpl;
import app.fpp.model.views.confirmation.targetpr.FcsPoRequisitionTempViewImpl;
import app.fpp.model.views.confirmation.targetpr.FcsViewNoPrClosedViewImpl;
import app.fpp.model.views.confirmation.targetpr.FcsViewNoPrViewImpl;
import app.fpp.model.views.confirmation.targetpr.ItemBjpFlagViewImpl;
import app.fpp.model.views.masterdata.ebs.BucketViewImpl;
import app.fpp.model.views.masterdata.ebs.CompanyOUViewImpl;
import app.fpp.model.views.masterdata.runnumber.RunNumConfViewImpl;
import app.fpp.model.views.masterdata.ebs.FcsViewGudangInventoryViewImpl;
import app.fpp.model.views.masterdata.ebs.KodePostingBJPViewImpl;
import app.fpp.model.views.masterdata.ebs.KodePostingViewImpl;
import app.fpp.model.views.masterdata.lov.confirmation.KomBudgetCustLovImpl;
import app.fpp.model.views.promoproposal.BiayaViewImpl;
import app.fpp.model.views.promoproposal.DiscountViewImpl;
import app.fpp.model.views.promoproposal.ProdukItemViewImpl;
import app.fpp.model.views.promoproposal.ProdukVariantViewImpl;
import app.fpp.model.views.promoproposal.PromoBonusVariantViewImpl;
import app.fpp.model.views.promoproposal.PromoBonusViewImpl;
import app.fpp.model.views.promoproposal.PromoProdukViewImpl;

import app.fpp.model.views.promoproposal.TargetViewImpl;

import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 12 10:28:28 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ConfirmationAMImpl extends CustomApplicationModuleImpl implements ConfirmationAM {
    /**
     * This is the default constructor (do not remove).
     */
    public ConfirmationAMImpl() {
    }
        
    public void setLoginToSession_ConfirmationAM(String key, String val) {
        this.setLoginToSession(key, val);
    }
    
    public void refreshReadyProposal() {
        ViewCriteria vc = this.getProposalReadyConfirmAdendumView1().getViewCriteria("ProposalReadyConfirmViewCriteria");
        this.getProposalReadyConfirmAdendumView1().executeQuery();
    }

    /**
     * Container's getter for ProposalConfirmationView1.
     * @return ProposalConfirmationView1
     */
    public ViewObjectImpl getProposalConfirmationView1() {
        return (ViewObjectImpl)findViewObject("ProposalConfirmationView1");
    }

    /**
     * Container's getter for PromoProdukView1.
     * @return PromoProdukView1
     */
    public PromoProdukViewImpl getPromoProdukView1() {
        return (PromoProdukViewImpl)findViewObject("PromoProdukView1");
    }

    /**
     * Container's getter for PromoProdukProposalConfirmationFk1Link1.
     * @return PromoProdukProposalConfirmationFk1Link1
     */
    public ViewLinkImpl getPromoProdukProposalConfirmationFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoProdukProposalConfirmationFk1Link1");
    }

    /**
     * Container's getter for BiayaView1.
     * @return BiayaView1
     */
    public ViewObjectImpl getBiayaView1() {
        return (ViewObjectImpl)findViewObject("BiayaView1");
    }

    /**
     * Container's getter for BiayaPromoProdukFk1Link1.
     * @return BiayaPromoProdukFk1Link1
     */
    public ViewLinkImpl getBiayaPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("BiayaPromoProdukFk1Link1");
    }

    /**
     * Container's getter for DiscountView1.
     * @return DiscountView1
     */
    public ViewObjectImpl getDiscountView1() {
        return (ViewObjectImpl)findViewObject("DiscountView1");
    }

    /**
     * Container's getter for DiscountPromoProdukFk1Link1.
     * @return DiscountPromoProdukFk1Link1
     */
    public ViewLinkImpl getDiscountPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("DiscountPromoProdukFk1Link1");
    }

    /**
     * Container's getter for ProdukItemView1.
     * @return ProdukItemView1
     */
    public ViewObjectImpl getProdukItemView1() {
        return (ViewObjectImpl)findViewObject("ProdukItemView1");
    }

    /**
     * Container's getter for ProdukItemPromoProdukFk1Link1.
     * @return ProdukItemPromoProdukFk1Link1
     */
    public ViewLinkImpl getProdukItemPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("ProdukItemPromoProdukFk1Link1");
    }

    /**
     * Container's getter for ProdukVariantView1.
     * @return ProdukVariantView1
     */
    public ViewObjectImpl getProdukVariantView1() {
        return (ViewObjectImpl)findViewObject("ProdukVariantView1");
    }

    /**
     * Container's getter for ProdukVariantPromoProdukFk1Link1.
     * @return ProdukVariantPromoProdukFk1Link1
     */
    public ViewLinkImpl getProdukVariantPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("ProdukVariantPromoProdukFk1Link1");
    }


    /**
     * Container's getter for PromoBonusView1.
     * @return PromoBonusView1
     */
    public PromoBonusViewImpl getPromoBonusView1() {
        return (PromoBonusViewImpl)findViewObject("PromoBonusView1");
    }

    /**
     * Container's getter for PromoBonusPromoProdukFk1Link1.
     * @return PromoBonusPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoBonusPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoBonusPromoProdukFk1Link1");
    }

    /**
     * Container's getter for TargetView1.
     * @return TargetView1
     */
    public ViewObjectImpl getTargetView1() {
        return (ViewObjectImpl)findViewObject("TargetView1");
    }

    /**
     * Container's getter for TargetPromoProdukFk1Link1.
     * @return TargetPromoProdukFk1Link1
     */
    public ViewLinkImpl getTargetPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("TargetPromoProdukFk1Link1");
    }


    /**
     * Container's getter for PromoBonusProdItemView1.
     * @return PromoBonusProdItemView1
     */
    public ViewObjectImpl getPromoBonusProdItemView1() {
        return (ViewObjectImpl)findViewObject("PromoBonusProdItemView1");
    }

    /**
     * Container's getter for PromoBonusProdItemPromoBonusFk1Link1.
     * @return PromoBonusProdItemPromoBonusFk1Link1
     */
    public ViewLinkImpl getPromoBonusProdItemPromoBonusFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoBonusProdItemPromoBonusFk1Link1");
    }

    /**
     * Container's getter for PromoBonusVariantView1.
     * @return PromoBonusVariantView1
     */
    public ViewObjectImpl getPromoBonusVariantView1() {
        return (ViewObjectImpl)findViewObject("PromoBonusVariantView1");
    }

    /**
     * Container's getter for PromoBonusVariantPromoBonusFk1Link1.
     * @return PromoBonusVariantPromoBonusFk1Link1
     */
    public ViewLinkImpl getPromoBonusVariantPromoBonusFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoBonusVariantPromoBonusFk1Link1");
    }

    /**
     * Container's getter for ProposalReadyConfirmView1.
     * @return ProposalReadyConfirmView1
     */
    public ViewObjectImpl getProposalReadyConfirmAdendumView1() {
        return (ViewObjectImpl)findViewObject("ProposalReadyConfirmAdendumView1");
    }

    /**
     * Container's getter for ProposalUpdateConfirmView1.
     * @return ProposalUpdateConfirmView1
     */
    public ViewObjectImpl getProposalUpdateConfirmAdendumView1() {
        return (ViewObjectImpl)findViewObject("ProposalUpdateConfirmAdendumView1");
    }

    /**
     * Container's getter for RunNumConfView1.
     * @return RunNumConfView1
     */
    public RunNumConfViewImpl getRunNumConfView1() {
        return (RunNumConfViewImpl)findViewObject("RunNumConfView1");
    }


    /**
     * Container's getter for FcsPoRequisitionTempView1.
     * @return FcsPoRequisitionTempView1
     */
    public ViewObjectImpl getFcsPoRequisitionTempView1() {
        return (ViewObjectImpl)findViewObject("FcsPoRequisitionTempView1");
    }


    /**
     * Container's getter for CompanyOUView1.
     * @return CompanyOUView1
     */
    public ViewObjectImpl getCompanyOUView1() {
        return (ViewObjectImpl)findViewObject("CompanyOUView1");
    }

    /**
     * Container's getter for KodePostingView1.
     * @return KodePostingView1
     */
    public KodePostingViewImpl getKodePostingView1() {
        return (KodePostingViewImpl)findViewObject("KodePostingView1");
    }

    /**
     * Container's getter for ProposalUpdatePrCreatedView1.
     * @return ProposalUpdatePrCreatedView1
     */
    public ViewObjectImpl getProposalUpdatePrCreatedView1() {
        return (ViewObjectImpl)findViewObject("ProposalUpdatePrCreatedView1");
    }

    /**
     * Container's getter for ProdBudgetByCustView1.
     * @return ProdBudgetByCustView1
     */
    public ViewObjectImpl getProdBudgetByCustView1() {
        return (ViewObjectImpl)findViewObject("ProdBudgetByCustView1");
    }

    /**
     * Container's getter for ProdBudgetByCustPromoProdukFk1Link1.
     * @return ProdBudgetByCustPromoProdukFk1Link1
     */
    public ViewLinkImpl getProdBudgetByCustPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("ProdBudgetByCustPromoProdukFk1Link1");
    }

    /**
     * Container's getter for ProdBudgetByPostView1.
     * @return ProdBudgetByPostView1
     */
    public ViewObjectImpl getProdBudgetByPostView1() {
        return (ViewObjectImpl)findViewObject("ProdBudgetByPostView1");
    }

    /**
     * Container's getter for ProdBudgetByPostPromoProdukFk1Link1.
     * @return ProdBudgetByPostPromoProdukFk1Link1
     */
    public ViewLinkImpl getProdBudgetByPostPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("ProdBudgetByPostPromoProdukFk1Link1");
    }

    /**
     * Container's getter for FcsViewNoPrView1.
     * @return FcsViewNoPrView1
     */
    public ViewObjectImpl getFcsViewNoPrView1() {
        return (ViewObjectImpl)findViewObject("FcsViewNoPrView1");
    }

    /**
     * Container's getter for FcsModifierHoView1.
     * @return FcsModifierHoView1
     */
    public ViewObjectImpl getFcsModifierHoView1() {
        return (ViewObjectImpl)findViewObject("FcsModifierHoView1");
    }

    /**
     * Container's getter for FcsQpModifierTempView1.
     * @return FcsQpModifierTempView1
     */
    public FcsQpModifierTempViewImpl getFcsQpModifierTempView1() {
        return (FcsQpModifierTempViewImpl)findViewObject("FcsQpModifierTempView1");
    }

    /**
     * Container's getter for FcsModifierAreaView1.
     * @return FcsModifierAreaView1
     */
    public FcsModifierAreaViewImpl getFcsModifierAreaView1() {
        return (FcsModifierAreaViewImpl)findViewObject("FcsModifierAreaView1");
    }

    /**
     * Container's getter for HeaderIdSeqView1.
     * @return HeaderIdSeqView1
     */
    public ViewObjectImpl getHeaderIdSeqView1() {
        return (ViewObjectImpl)findViewObject("HeaderIdSeqView1");
    }

    /**
     * Container's getter for ItemBjpFlagView1.
     * @return ItemBjpFlagView1
     */
    public ItemBjpFlagViewImpl getItemBjpFlagView1() {
        return (ItemBjpFlagViewImpl)findViewObject("ItemBjpFlagView1");
    }

    /**
     * Container's getter for KodePostingBJPView1.
     * @return KodePostingBJPView1
     */
    public KodePostingBJPViewImpl getKodePostingBJPView1() {
        return (KodePostingBJPViewImpl)findViewObject("KodePostingBJPView1");
    }

    /**
     * Container's getter for FcsViewNoPrClosedView1.
     * @return FcsViewNoPrClosedView1
     */
    public FcsViewNoPrClosedViewImpl getFcsViewNoPrClosedView1() {
        return (FcsViewNoPrClosedViewImpl)findViewObject("FcsViewNoPrClosedView1");
    }

    /**
     * Container's getter for FcsApprovalPathView1.
     * @return FcsApprovalPathView1
     */
    public FcsApprovalPathViewImpl getFcsApprovalPathView1() {
        return (FcsApprovalPathViewImpl)findViewObject("FcsApprovalPathView1");
    }


    /**
     * Container's getter for FcsViewGudangInventoryView1.
     * @return FcsViewGudangInventoryView1
     */
    public FcsViewGudangInventoryViewImpl getFcsViewGudangInventoryView1() {
        return (FcsViewGudangInventoryViewImpl)findViewObject("FcsViewGudangInventoryView1");
    }

    /**
     * Container's getter for FcsModifierAreaExclView1.
     * @return FcsModifierAreaExclView1
     */
    public FcsModifierAreaExclViewImpl getFcsModifierAreaExclView1() {
        return (FcsModifierAreaExclViewImpl)findViewObject("FcsModifierAreaExclView1");
    }

    /**
     * Container's getter for FcsModifierHoExclView1.
     * @return FcsModifierHoExclView1
     */
    public FcsModifierHoExclViewImpl getFcsModifierHoExclView1() {
        return (FcsModifierHoExclViewImpl)findViewObject("FcsModifierHoExclView1");
    }

    /**
     * Container's getter for FcsQpModifierTempExclView1.
     * @return FcsQpModifierTempExclView1
     */
    public ViewObjectImpl getFcsQpModifierTempExclView1() {
        return (ViewObjectImpl)findViewObject("FcsQpModifierTempExclView1");
    }

    /**
     * Container's getter for RealisasiItemPaketView1.
     * @return RealisasiItemPaketView1
     */
    public ViewObjectImpl getRealisasiItemPaketView1() {
        return (ViewObjectImpl)findViewObject("RealisasiItemPaketView1");
    }

    /**
     * Container's getter for RealisasiItemPaketPromoProdukFk1Link1.
     * @return RealisasiItemPaketPromoProdukFk1Link1
     */
    public ViewLinkImpl getRealisasiItemPaketPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("RealisasiItemPaketPromoProdukFk1Link1");
    }

    /**
     * Container's getter for KomBudgetPostLov1.
     * @return KomBudgetPostLov1
     */
    public ViewObjectImpl getKomBudgetPostLov1() {
        return (ViewObjectImpl)findViewObject("KomBudgetPostLov1");
    }

    /**
     * Container's getter for LovbudgetcustomerView1.
     * @return LovbudgetcustomerView1
     */
    public ViewObjectImpl getLovbudgetcustomerView1() {
        return (ViewObjectImpl)findViewObject("LovbudgetcustomerView1");
    }

    /**
     * Container's getter for KomBudgetCustLov1.
     * @return KomBudgetCustLov1
     */
    public KomBudgetCustLovImpl getKomBudgetCustLov1() {
        return (KomBudgetCustLovImpl)findViewObject("KomBudgetCustLov1");
    }

    /**
     * Container's getter for DuplicateProdBudByIdView1.
     * @return DuplicateProdBudByIdView1
     */
    public ViewObjectImpl getDuplicateProdBudByIdView1() {
        return (ViewObjectImpl)findViewObject("DuplicateProdBudByIdView1");
    }

    /**
     * Container's getter for FcsViewNoModifierView1.
     * @return FcsViewNoModifierView1
     */
    public FcsViewNoModifierViewImpl getFcsViewNoModifierView1() {
        return (FcsViewNoModifierViewImpl)findViewObject("FcsViewNoModifierView1");
    }

    /**
     * Container's getter for CategoryPcLogView1.
     * @return CategoryPcLogView1
     */
    public CategoryPcLogViewImpl getCategoryPcLogView1() {
        return (CategoryPcLogViewImpl)findViewObject("CategoryPcLogView1");
    }

    /**
     * Container's getter for CategoryPcLogProposalConfirmationFk1Link1.
     * @return CategoryPcLogProposalConfirmationFk1Link1
     */
    public ViewLinkImpl getCategoryPcLogProposalConfirmationFk1Link1() {
        return (ViewLinkImpl)findViewLink("CategoryPcLogProposalConfirmationFk1Link1");
    }

    /**
     * Container's getter for BucketView1.
     * @return BucketView1
     */
    public ViewObjectImpl getBucketView1() {
        return (ViewObjectImpl)findViewObject("BucketView1");
    }

    /**
     * Container's getter for CheckCmRealisasiDcv1.
     * @return CheckCmRealisasiDcv1
     */
    public CheckCmRealisasiDcvImpl getCheckCmRealisasiDcv1() {
        return (CheckCmRealisasiDcvImpl)findViewObject("CheckCmRealisasiDcv1");
    }

    /**
     * Container's getter for UploadDownloadView1.
     * @return UploadDownloadView1
     */
    public ViewObjectImpl getUploadDownloadView1() {
        return (ViewObjectImpl)findViewObject("UploadDownloadView1");
    }

    /**
     * Container's getter for UploadDownloadConfirmationFk1Link1.
     * @return UploadDownloadConfirmationFk1Link1
     */
    public ViewLinkImpl getUploadDownloadConfirmationFk1Link1() {
        return (ViewLinkImpl)findViewLink("UploadDownloadConfirmationFk1Link1");
    }

    /**
     * Container's getter for FcsModifierCeckBucketItemCategory1.
     * @return FcsModifierCeckBucketItemCategory1
     */
    public FcsModifierCeckBucketItemCategoryImpl getFcsModifierCeckBucketItemCategory1() {
        return (FcsModifierCeckBucketItemCategoryImpl)findViewObject("FcsModifierCeckBucketItemCategory1");
    }

    /**
     * Container's getter for CheckRealisasiSalesOrder1.
     * @return CheckRealisasiSalesOrder1
     */
    public CheckRealisasiSalesOrderImpl getCheckRealisasiSalesOrder1() {
        return (CheckRealisasiSalesOrderImpl)findViewObject("CheckRealisasiSalesOrder1");
    }

    /**
     * Container's getter for ProdBudgetByView1.
     * @return ProdBudgetByView1
     */
    public ViewObjectImpl getProdBudgetByView1() {
        return (ViewObjectImpl)findViewObject("ProdBudgetByView1");
    }

    /**
     * Container's getter for checkAddendumBudgetClearView1.
     * @return checkAddendumBudgetClearView1
     */
    public checkAddendumBudgetClearViewImpl getcheckAddendumBudgetClearView1() {
        return (checkAddendumBudgetClearViewImpl)findViewObject("checkAddendumBudgetClearView1");
    }

    /**
     * Container's getter for checkProdukApprovalModifierOnIn1.
     * @return checkProdukApprovalModifierOnIn1
     */
    public checkProdukApprovalModifierOnInImpl getcheckProdukApprovalModifierOnIn1() {
        return (checkProdukApprovalModifierOnInImpl)findViewObject("checkProdukApprovalModifierOnIn1");
    }

    /**
     * Container's getter for CancelConfirmationClearBudgetView1.
     * @return CancelConfirmationClearBudgetView1
     */
    public CancelConfirmationClearBudgetViewImpl getCancelConfirmationClearBudgetView1() {
        return (CancelConfirmationClearBudgetViewImpl)findViewObject("CancelConfirmationClearBudgetView1");
    }

    /**
     * Container's getter for checkOverBudgetClearView1.
     * @return checkOverBudgetClearView1
     */
    public checkOverBudgetClearViewImpl getcheckOverBudgetClearView1() {
        return (checkOverBudgetClearViewImpl)findViewObject("checkOverBudgetClearView1");
    }

    /**
     * Container's getter for getPPIDRefView1.
     * @return getPPIDRefView1
     */
    public getPPIDRefViewImpl getgetPPIDRefView1() {
        return (getPPIDRefViewImpl)findViewObject("getPPIDRefView1");
    }

    /**
     * Container's getter for ProposalForAdendumView1.
     * @return ProposalForAdendumView1
     */
    public ProposalForAdendumViewImpl getProposalForAdendumView1() {
        return (ProposalForAdendumViewImpl)findViewObject("ProposalForAdendumView1");
    }

    /**
     * Container's getter for ProdRealSummaryView1.
     * @return ProdRealSummaryView1
     */
    public ProdRealSummaryViewImpl getProdRealSummaryView1() {
        return (ProdRealSummaryViewImpl)findViewObject("ProdRealSummaryView1");
    }

    /**
     * Container's getter for EmailNotifReceiverView1.
     * @return EmailNotifReceiverView1
     */
    public ViewObjectImpl getEmailNotifReceiverView1() {
        return (ViewObjectImpl)findViewObject("EmailNotifReceiverView1");
    }

    /**
     * Container's getter for EmailNotifReceiverProposalViewLink1.
     * @return EmailNotifReceiverProposalViewLink1
     */
    public ViewLinkImpl getEmailNotifReceiverProposalViewLink1() {
        return (ViewLinkImpl)findViewLink("EmailNotifReceiverProposalViewLink1");
    }


    /**
     * Container's getter for getEmailUserApprovalHistory1.
     * @return getEmailUserApprovalHistory1
     */
    public getEmailUserApprovalHistoryImpl getgetEmailUserApprovalHistory1() {
        return (getEmailUserApprovalHistoryImpl)findViewObject("getEmailUserApprovalHistory1");
    }

    /**
     * Container's getter for getPPorPCView1.
     * @return getPPorPCView1
     */
    public getPPorPCViewImpl getgetPPorPCView1() {
        return (getPPorPCViewImpl)findViewObject("getPPorPCView1");
    }

    /**
     * Container's getter for CloseValidationDcvAmount1.
     * @return CloseValidationDcvAmount1
     */
    public CloseValidationDcvAmountImpl getCloseValidationDcvAmount1() {
        return (CloseValidationDcvAmountImpl)findViewObject("CloseValidationDcvAmount1");
    }

    /**
     * Container's getter for PromoProdukLineClosedView1.
     * @return PromoProdukLineClosedView1
     */
    public PromoProdukLineClosedViewImpl getPromoProdukLineClosedView1() {
        return (PromoProdukLineClosedViewImpl)findViewObject("PromoProdukLineClosedView1");
    }

    /**
     * Container's getter for PromoCustomerAreaView1.
     * @return PromoCustomerAreaView1
     */
    public ViewObjectImpl getPromoCustomerAreaView1() {
        return (ViewObjectImpl)findViewObject("PromoCustomerAreaView1");
    }

    /**
     * Container's getter for PromoCustomerAreaProposalConfirmationFk1Link1.
     * @return PromoCustomerAreaProposalConfirmationFk1Link1
     */
    public ViewLinkImpl getPromoCustomerAreaProposalConfirmationFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustomerAreaProposalConfirmationFk1Link1");
    }

    /**
     * Container's getter for PromoCustomerHoView1.
     * @return PromoCustomerHoView1
     */
    public ViewObjectImpl getPromoCustomerHoView1() {
        return (ViewObjectImpl)findViewObject("PromoCustomerHoView1");
    }

    /**
     * Container's getter for PromoCustomerHoPromoProdukFk1Link1.
     * @return PromoCustomerHoPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoCustomerHoPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustomerHoPromoProdukFk1Link1");
    }

    /**
     * Container's getter for PromoCustxAreaView1.
     * @return PromoCustxAreaView1
     */
    public ViewObjectImpl getPromoCustxAreaView1() {
        return (ViewObjectImpl)findViewObject("PromoCustxAreaView1");
    }

    /**
     * Container's getter for PromoCustxAreaPromoProdukFk1Link1.
     * @return PromoCustxAreaPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoCustxAreaPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustxAreaPromoProdukFk1Link1");
    }

    /**
     * Container's getter for PromoCustxHoView1.
     * @return PromoCustxHoView1
     */
    public ViewObjectImpl getPromoCustxHoView1() {
        return (ViewObjectImpl)findViewObject("PromoCustxHoView1");
    }

    /**
     * Container's getter for PromoCustxHoPromoProdukFk1Link1.
     * @return PromoCustxHoPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoCustxHoPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustxHoPromoProdukFk1Link1");
    }
}
