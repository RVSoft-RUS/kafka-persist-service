package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CX_TXB_EVT", schema = "RAW_DATA_NRT")
public class CxTxbEvt {
    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    private String zp;
    @Column(name = "x_Txb_Source")
    private String xTxbSource;
    @Column(name = "x_Txb_Prod")
    private String xTxbProd;
    @Column(name = "x_Txb_Org_Type")
    private String xTxbOrgType;
    @Column(name = "x_Txb_Kic_Subtype")
    private String xTxbKicSubtype;
    @Column(name = "x_Txb_Cont_Numb")
    private String xTxbContNumb;
    @Column(name = "x_Txb_Cont_Fio")
    private String xTxbContFio;
    @Column(name = "x_Txb_Code_Id")
    private String xTxbCodeId;
    @Column(name = "x_Txb_Code")
    private String xTxbCode;
    @Column(name = "x_Txb_Act")
    private String xTxbAct;
    @Column(name = "x_Tlt_Vsp")
    private String xTltVsp;
    @Column(name = "x_Tlt_To_Vko_Dt")
    private LocalDateTime xTltToVkoDt;
    @Column(name = "x_Tlt_Tb")
    private String xTltTb;
    @Column(name = "x_Tlt_Reserv_Dt")
    private LocalDateTime xTltReservDt;
    @Column(name = "x_Tlt_Reason")
    private String xTltReason;
    @Column(name = "x_Tlt_Osp")
    private String xTltOsp;
    @Column(name = "x_Tlt_Org_Name")
    private String xTltOrgName;
    @Column(name = "x_Tlt_Msc2_Res")
    private String xTltMsc2Res;
    @Column(name = "x_Tlt_Msc2_Dt")
    private LocalDateTime xTltMsc2Dt;
    @Column(name = "x_Tlt_Msc1_Res")
    private String xTltMsc1Res;
    @Column(name = "x_Tlt_Inn")
    private String xTltInn;
    @Column(name = "x_Tlt_Agr_Num")
    private String xTltAgrNum;
    @Column(name = "x_Tlt_Agr_Date")
    private LocalDateTime xTltAgrDate;
    @Column(name = "x_Sign_Type")
    private String xSignType;
    @Column(name = "x_Sg_Type")
    private String xSgType;
    @Column(name = "x_Sg_Templ_Type")
    private String xSgTemplType;
    @Column(name = "x_Sg_Number")
    private String xSgNumber;
    @Column(name = "x_Sg_Mid_Name")
    private String xSgMidName;
    @Column(name = "x_Sg_Mid_Cl_Name")
    private String xSgMidClName;
    @Column(name = "x_Sg_Lst_Name")
    private String xSgLstName;
    @Column(name = "x_Sg_Lst_Cl_Name")
    private String xSgLstClName;
    @Column(name = "x_Sg_Job_Title")
    private String xSgJobTitle;
    @Column(name = "x_Sg_Job_Cl_Title")
    private String xSgJobClTitle;
    @Column(name = "x_Sg_Full_Name")
    private String xSgFullName;
    @Column(name = "x_Sg_Fst_Name")
    private String xSgFstName;
    @Column(name = "x_Sg_Fst_Cl_Name")
    private String xSgFstClName;
    @Column(name = "x_Sg_Doc")
    private String xSgDoc;
    @Column(name = "x_Sg_Date")
    private LocalDateTime xSgDate;
    @Column(name = "x_Sg_Cl_Number")
    private String xSgClNumber;
    @Column(name = "x_Sg_Cl_Full_Name")
    private String xSgClFullName;
    @Column(name = "x_Sg_Cl_Doc")
    private String xSgClDoc;
    @Column(name = "x_Sg_Cl_Date")
    private LocalDateTime xSgClDate;
    @Column(name = "x_Sbrf_Wk_H_Dur_Act")
    private BigDecimal xSbrfWkHDurAct;
    @Column(name = "x_Sbrf_Wk_H_Dur")
    private BigDecimal xSbrfWkHDur;
    @Column(name = "x_Rpa_Flag")
    private String xRpaFlag;
    @Column(name = "x_Rpa_Comment")
    private String xRpaComment;
    @Column(name = "x_Req_Sign")
    private String xReqSign;
    @Column(name = "x_Req_Scan")
    private String xReqScan;
    @Column(name = "x_Req_Doc")
    private String xReqDoc;
    @Column(name = "x_Operation_Uid")
    private String xOperationUid;
    @Column(name = "x_New_Prod_Flg")
    private String xNewProdFlg;
    @Column(name = "x_Kic_Oc_City")
    private String xKicOcCity;
    @Column(name = "x_Kic_Divn_Id")
    private String xKicDivnId;
    @Column(name = "x_Indicator")
    private String xIndicator;
    @Column(name = "x_Ic_Spec")
    private String xIcSpec;
    @Column(name = "x_Ic_Reason")
    private String xIcReason;
    @Column(name = "x_Ic_Judgement")
    private String xIcJudgement;
    @Column(name = "x_Ic_Comment")
    private String xIcComment;
    @Column(name = "x_Ex_Created_By")
    private String xExCreatedBy;
    @Column(name = "X_EXPERTICE_ID")
    private String xExperticeId;
    @Column(name = "x_Doc")
    private String xDoc;
    @Column(name = "x_Delegated_Flg")
    private String xDelegatedFlg;
    @Column(name = "x_Condition")
    private String xCondition;
    @Column(name = "x_Client_It")
    private String xClientIt;
    @Column(name = "x_Client_Count")
    private String xClientCount;
    @Column(name = "x_Assign_Dt")
    private LocalDateTime xAssignDt;
    @Column(name = "x_Act_Source")
    private String xActSource;
    @Column(name = "x_Act_Code")
    private String xActCode;
    @Column(name = "work_Remain_Min")
    private BigDecimal workRemainMin;
    @Column(name = "wait_Change_Dt")
    private LocalDateTime waitChangeDt;
    @Column(name = "txb_Wait")
    private String txbWait;
    @Column(name = "todo_Plan_Start_Dt")
    private LocalDateTime todoPlanStartDt;
    @Column(name = "todo_Plan_End_Dt")
    private LocalDateTime todoPlanEndDt;
    @Column(name = "todo_Cd")
    private String todoCd;
    @Column(name = "todo_After_Dt")
    private LocalDateTime todoAfterDt;
    @Column(name = "todo_Actl_Start_Dt")
    private LocalDateTime todoActlStartDt;
    @Column(name = "todo_Actl_End_Dt")
    private LocalDateTime todoActlEndDt;
    private String te;
    @Column(name = "target_Per_Id")
    private String targetPerId;
    @Column(name = "target_Ou_Id")
    private String targetOuId;
    @Column(name = "st_L")
    private String stL;
    @Column(name = "stage2_Start")
    private LocalDateTime stage2Start;
    @Column(name = "stage1_Start")
    private LocalDateTime stage1Start;
    @Column(name = "sent_Bbmo_Flg")
    private String sentBbmoFlg;
    @Column(name = "sbrf_Duration_Planned_Min")
    private BigDecimal sbrfDurationPlannedMin;
    @Column(name = "sbrf_Cg_Id")
    private String sbrfCgId;
    @Column(name = "sbbol_Login")
    private String sbbolLogin;
    @Column(name = "sbbol_Flg")
    private String sbbolFlg;
    @Column(name = "result_")
    private String result;
    @Column(name = "reg_Address")
    private String regAddress;
    @Column(name = "pr_Sr_Id")
    private String prSrId;
    @Column(name = "priority_Cd")
    private String priorityCd;
    @Column(name = "prev_Act_Id")
    private String prevActId;
    @Column(name = "pprb_Agr_Id")
    private String pprbAgrId;
    @Column(name = "pct_Complete")
    private BigDecimal pctComplete;
    @Column(name = "par_Act_Id")
    private String parActId;
    @Column(name = "owner_Postn_Id")
    private String ownerPostnId;
    @Column(name = "owner_Per_Id")
    private String ownerPerId;
    @Column(name = "owner_Login")
    private String ownerLogin;
    @Column(name = "opty_Id")
    private String optyId;
    private String name;
    private String mvd;
    @Column(name = "msh_Release_Id")
    private String mshReleaseId;
    @Column(name = "msh_Prod_Id")
    private String mshProdId;
    @Column(name = "modification_Num")
    private BigDecimal modificationNum;
    @Column(name = "last_Upd_By")
    private String lastUpdBy;
    @Column(name = "last_Upd")
    private LocalDateTime lastUpd;
    @Column(name = "km_Visibility")
    private String kmVisibility;
    @Column(name = "kic_Flg")
    private String kicFlg;
    @Column(name = "frames_Flg")
    private String framesFlg;
    @Column(name = "evt_Stat_Cd")
    private String evtStatCd;
    @Column(name = "ecm_Tdkkb_Id")
    private String ecmTdkkbId;
    @Column(name = "duration_Hrs")
    private BigDecimal durationHrs;
    @Column(name = "done_Flg")
    private String doneFlg;
    @Column(name = "delay_To_Dt")
    private LocalDateTime delayToDt;
    private String decision;
    @Column(name = "db_Last_Upd_Src")
    private String dbLastUpdSrc;
    @Column(name = "db_Last_Upd")
    private LocalDateTime dbLastUpd;
    @Column(name = "created_By")
    private String createdBy;
    private LocalDateTime created;
    @Column(name = "conflict_Id")
    private String conflictId;
    @Column(name = "collect_Flg")
    private String collectFlg;
    @Column(name = "cash_Agreem_Id")
    private String cashAgreemId;
    private String bi;
    @Column(name = "auto_Close_Inc_Flg")
    private String autoCloseIncFlg;
    @Column(name = "auto_Close_Flg")
    private String autoCloseFlg;
    @Column(name = "appt_Start_Dt")
    private LocalDateTime apptStartDt;
    @Column(name = "appt_Rept_Type")
    private String apptReptType;
    @Column(name = "appt_Rept_Repl_Cd")
    private String apptReptReplCd;
    @Column(name = "appt_Rept_Flg")
    private String apptReptFlg;
    @Column(name = "appt_Rept_End_Dt")
    private LocalDateTime apptReptEndDt;
    @Column(name = "appt_End_Tm")
    private BigDecimal apptEndTm;
    @Column(name = "appt_End_Dt")
    private LocalDateTime apptEndDt;
    @Column(name = "appt_Duration_Min")
    private BigDecimal apptDurationMin;
    @Column(name = "appt_Alarm_Tm_Min")
    private BigDecimal apptAlarmTmMin;
    @Column(name = "alarm_Flag")
    private String alarmFlag;
    @Column(name = "agreem_Num")
    private String agreemNum;
    @Column(name = "ctl_Validfrom")
    private LocalDateTime ctlValidfrom;
    @Column(name = "ctl_Action")
    private String ctlAction;
    @Column(name = "ctl_Loading")
    private Long ctlLoading;
    @Column(name = "ctl_Csn")
    private BigDecimal ctlCsn;
    @Column(name = "CTL_SEQNO")
    private Long ctlSeqno;
}

