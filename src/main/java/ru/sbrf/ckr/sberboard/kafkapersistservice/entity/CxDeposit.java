package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CX_DEPOSIT", schema = "RAW_DATA_NRT")
public class CxDeposit {
    @Id
    @Column (name = "ROW_ID")
    private String rowId;
    @Column (name = "withdrwl_Order_Flg")
    private String withdrwlOrderFlg;
    @Column (name = "vsp_Id")
    private String vspId;
    private String status;
    @Column (name = "settl_Accnt")
    private String settlAccnt;
    @Column (name = "scnd_Line_Ret_Flg")
    private String scndLineRetFlg;
    private String route;
    @Column (name = "ret_Swift")
    private String retSwift;
    @Column (name = "ret_Sber_Flg")
    private String retSberFlg;
    @Column (name = "ret_Int_Swift")
    private String retIntSwift;
    @Column (name = "ret_Int_Sber_Flg")
    private String retIntSberFlg;
    @Column (name = "ret_Int_Corr_Accnt")
    private String retIntCorrAccnt;
    @Column (name = "ret_Int_Chrg_Acc_Flg")
    private String retIntChrgAccFlg;
    @Column (name = "ret_Int_Bic")
    private String retIntBic;
    @Column (name = "ret_Int_Accnt_Num")
    private String retIntAccntNum;
    @Column (name = "ret_Corr_Accnt")
    private String retCorrAccnt;
    @Column (name = "ret_Chrg_Acc_Flg")
    private String retChrgAccFlg;
    @Column (name = "ret_Bic")
    private String retBic;
    @Column (name = "ret_Accnt_Num")
    private String retAccntNum;
    @Column (name = "req_Id")
    private String reqId;
    @Column (name = "report_Template")
    private String reportTemplate;
    @Column (name = "refusal_Reason")
    private String refusalReason;
    @Column (name = "refusal_Comment")
    private String refusalComment;
    @Column (name = "pr_Emp_Id")
    private String prEmpId;
    @Column (name = "prod_Type")
    private String prodType;
    @Column (name = "prev_Cntrct_Num")
    private String prevCntrctNum;
    @Column (name = "prev_Cntrct_Dt")
    private LocalDateTime prevCntrctDt;
    @Column (name = "pprb_State_Code")
    private String pprbStateCode;
    @Column (name = "pprb_Int_Status")
    private String pprbIntStatus;
    @Column (name = "pprb_Id")
    private String pprbId;
    @Column (name = "pprb_Emp_Name")
    private String pprbEmpName;
    @Column (name = "pprb_Contract_Num")
    private String pprbContractNum;
    @Column (name = "pprb_Accnt_Open_Dt")
    private LocalDateTime pprbAccntOpenDt;
    @Column (name = "pprb_Accnt_Num")
    private String pprbAccntNum;
    @Column (name = "other_Condtns")
    private String otherCondtns;
    @Column (name = "modification_Num")
    private BigDecimal modificationNum;
    @Column (name = "ml_Probability")
    private BigDecimal mlProbability;
    @Column (name = "last_Upd_By")
    private String lastUpdBy;
    @Column (name = "last_Upd")
    private LocalDateTime lastUpd;
    @Column (name = "int_Rate")
    private BigDecimal intRate;
    @Column (name = "int_Pay_Term")
    private String intPayTerm;
    @Column (name = "goz_Flg")
    private String gozFlg;
    @Column (name = "file_Name")
    private String fileName;
    @Column (name = "exec_Div_Id")
    private String execDivId;
    @Column (name = "early_Term_Cond")
    private String earlyTermCond;
    @Column (name = "early_Demand_Cond")
    private String earlyDemandCond;
    @Column (name = "diff_Term_Rate_Flg")
    private String diffTermRateFlg;
    @Column (name = "dep_Start_Dt")
    private LocalDateTime depStartDt;
    @Column (name = "dep_Period")
    private BigDecimal depPeriod;
    @Column (name = "dep_End_Dt")
    private LocalDateTime depEndDt;
    @Column (name = "dep_Curcy")
    private String depCurcy;
    @Column (name = "dep_Amt")
    private BigDecimal depAmt;
    @Column (name = "db_Last_Upd_Src")
    private String dbLastUpdSrc;
    @Column (name = "db_Last_Upd")
    private LocalDateTime dbLastUpd;
    @Column (name = "created_By")
    private String createdBy;
    private LocalDateTime created;
    @Column (name = "contract_Type")
    private String contractType;
    @Column (name = "contract_Start_Dt")
    private LocalDateTime contractStartDt;
    @Column (name = "contract_Num")
    private String contractNum;
    @Column (name = "conflict_Id")
    private String conflictId;
    @Column (name = "compl_Dt")
    private LocalDateTime complDt;
    @Column (name = "close_Dt")
    private LocalDateTime closeDt;
    @Column (name = "chrg_Swift")
    private String chrgSwift;
    @Column (name = "chrg_Corr_Accnt")
    private String chrgCorrAccnt;
    @Column (name = "chrg_Bic")
    private String chrgBic;
    @Column (name = "chrg_Accnt_Num")
    private String chrgAccntNum;
    @Column (name = "can_Replenish")
    private String canReplenish;
    @Column (name = "can_Recall_Start")
    private BigDecimal canRecallStart;
    @Column (name = "can_Recall_End")
    private BigDecimal canRecallEnd;
    @Column (name = "can_Recall")
    private String canRecall;
    @Column (name = "bank_Name")
    private String bankName;
    @Column (name = "archive_Flg")
    private String archiveFlg;
    @Column (name = "agrmnt_Num")
    private String agrmntNum;
    @Column (name = "agrmnt_Dt")
    private LocalDateTime agrmntDt;
    @Column (name = "ACCNT_ID")
    private String accntId;
    @Column (name = "ctl_Csn")
    private BigDecimal ctlCsn;
    @Column (name = "ctl_Loading")
    private Long ctlLoading;
    @Column (name = "ctl_Validfrom")
    private LocalDateTime ctlValidfrom;
    @Column (name = "ctl_Action")
    private String ctlAction;
    @Column(name = "CTL_SEQNO")
    private Long ctlSeqno;
}
