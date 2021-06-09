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
@Table(name = "CX_SR_CONCL", schema = "RAW_DATA_NRT")
public class CxSrConcl extends MessageObject {
    @Column(name = "CLOSE_DATE")
    private LocalDateTime closeDate;
    @Column(name = "STATUS_CD")
    private String statusCd;
    @Column(name = "RATIONALE_DECISION")
    private String rationaleDecision;
    @Column(name = "REVIEW_RESULT")
    private String reviewResult;
    @Column(name = "CTL_CSN")
    private BigDecimal ctlCsn;
    @Column(name = "ACC_NUMBER")
    private String accNumber;
    @Column(name = "PAR_ROW_ID")
    private String parRowId;
    @Column(name = "MODIFICATION_NUM")
    private BigDecimal modificationNum;
    @Column(name = "PURPOSE_PAYMENT_TEXT")
    private String purposePaymentText;
    @Column(name = "BEFORE_CLAIM_FLG")
    private String beforeClaimFlg;
    @Column(name = "REPAY_AMT")
    private BigDecimal repayAmt;
    @Column(name = "DB_LAST_UPD_SRC")
    private String dbLastUpdSrc;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DB_LAST_UPD")
    private LocalDateTime dbLastUpd;
    @Column(name = "NEW_CREATED_BY")
    private String newCreatedBy;
    @Column(name = "POST_LVL")
    private BigDecimal postLvl;
    @Column(name = "CANCEL_CONCL_ID")
    private String cancelConclId;
    @Column(name = "TB_ID")
    private String tbId;
    @Column(name = "APPROVER_ID")
    private String approverId;
    @Column(name = "RET_CAUSE_CD")
    private String retCauseCd;
    @Column(name = "COMPLEXITY")
    private String complexity;
    @Column(name = "REPAY_AMT_RUR")
    private BigDecimal repayAmtRur;
    @Column(name = "CTL_ACTION")
    private String ctlAction;
    @Column(name = "COMM_MATCHING")
    private String commMatching;
    @Column(name = "RECEIVABLES_ACC")
    private String receivablesAcc;
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;
    @Column(name = "REPAY_CUR_CD")
    private String repayCurCd;
    @Column(name = "CONFLICT_ID")
    private String conflictId;
    @Column(name = "APPROVAL_DATE")
    private LocalDateTime approvalDate;
    @Column(name = "REPAY_MODE_CD")
    private String repayModeCd;
    @Column(name = "DIV_ID")
    private String divId;
    @Column(name = "COMP_ID")
    private String compId;
    @Column(name = "SENT_APPROVAL_DATE")
    private LocalDateTime sentApprovalDate;
    @Column(name = "SERVICE")
    private String service;
    @Column(name = "REOPEN_DATE")
    private LocalDateTime reopenDate;
    @Column(name = "RESULT_CD")
    private String resultCd;
    @Column(name = "SRV_FEE")
    private BigDecimal srvFee;
    @Column(name = "PURPOSE_PAYMENT")
    private String purposePayment;
    @Column(name = "APPR_RESULT")
    private String apprResult;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "SRV_FEE_CURCY_CD")
    private String srvFeeCurcyCd;
    @Column(name = "EMPLOYEE_FULL_NAME")
    private String employeeFullName;
    @Column(name = "LAST_UPD")
    private LocalDateTime lastUpd;
    @Column(name = "LINE_NUMBER")
    private BigDecimal lineNumber;
    @Column(name = "CHANGE_LIMIT_DATE")
    private LocalDateTime changeLimitDate;
    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    @Column(name = "CREATED")
    private LocalDateTime created;
    @Column(name = "EXECUTOR_ID")
    private String executorId;
    @Column(name = "COMM_SR_EXECUTOR")
    private String commSrExecutor;
    @Column(name = "START_EXEC_DATE")
    private LocalDateTime startExecDate;
    @Column(name = "SR_ID")
    private String srId;
    @Column(name = "COMM_EXECUTOR")
    private String commExecutor;
    @Column(name = "CONC_NUM")
    private String concNum;
    @Column(name = "REQUEST_REASON")
    private String requestReason;
    @Column(name = "CTL_LOADING")
    private Long ctlLoading;
    @Column(name = "DISTRIB_DATE")
    private LocalDateTime distribDate;
    @Column(name = "SAMO_FLG")
    private String samoFlg;
    @Column(name = "CTL_VALIDFROM")
    private LocalDateTime ctlValidfrom;
    @Column(name = "INCR_PACK_RUN_ID")
    private Long incrPackRunId;
}
