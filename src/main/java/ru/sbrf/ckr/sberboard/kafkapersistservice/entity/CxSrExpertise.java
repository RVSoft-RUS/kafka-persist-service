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
@Table(name = "CX_SR_EXPERTISE", schema = "RAW_DATA_NRT")
public class CxSrExpertise extends MessageObject {
    @Column(name = "DIV_ID")
    private String divId;
    @Column(name = "CONFLICT_ID")
    private String conflictId;
    @Column(name = "SM_DESC_ERROR")
    private String smDescError;
    @Column(name = "SM_WORK_GROUP")
    private String smWorkGroup;
    @Column(name = "FN_FOLDER_ID")
    private String fnFolderId;
    @Column(name = "ASGN_USR_EXCLD_FLG")
    private String asgnUsrExcldFlg;
    @Column(name = "CTL_ACTION")
    private String ctlAction;
    @Column(name = "CONC_TEXT")
    private String concText;
    @Column(name = "LAST_UPD")
    private LocalDateTime lastUpd;
    @Column(name = "IN_WORK_DT")
    private LocalDateTime inWorkDt;
    @Column(name = "EMP_ID")
    private String empId;
    @Column(name = "ROUTE_CD")
    private String routeCd;
    @Column(name = "ASGN_DT")
    private LocalDateTime asgnDt;
    @Column(name = "DESC_TEXT")
    private String descText;
    @Column(name = "EXP_CREATED_TYPE")
    private String expCreatedType;
    @Column(name = "ASGN_DNRM_FLG")
    private String asgnDnrmFlg;
    @Column(name = "CREATED")
    private LocalDateTime created;
    @Column(name = "CST_NAME")
    private String cstName;
    @Column(name = "COMP_ID")
    private String compId;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "ROUTE_CALC_CD")
    private String routeCalcCd;
    @Column(name = "CTL_VALIDFROM")
    private LocalDateTime ctlValidfrom;
    @Column(name = "SR_ID")
    private String srId;
    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    @Column(name = "QUESTION_ID")
    private String questionId;
    @Column(name = "MODIFICATION_NUM")
    private BigDecimal modificationNum;
    @Column(name = "ROUTE_DT")
    private LocalDateTime routeDt;
    @Column(name = "DB_LAST_UPD")
    private LocalDateTime dbLastUpd;
    @Column(name = "INN_FLG")
    private String innFlg;
    @Column(name = "CHECK_SM_PARAM_FLG")
    private String checkSmParamFlg;
    @Column(name = "SM_EXECUTOR")
    private String smExecutor;
    @Column(name = "VSP_ID")
    private String vspId;
    @Column(name = "ROUTER_ID")
    private String routerId;
    @Column(name = "DB_LAST_UPD_SRC")
    private String dbLastUpdSrc;
    @Column(name = "PLAN_END_DT")
    private LocalDateTime planEndDt;
    @Column(name = "CST_OU_ID")
    private String cstOuId;
    @Column(name = "CTL_CSN")
    private BigDecimal ctlCsn;
    @Column(name = "SM_ID")
    private String smId;
    @Column(name = "ASGN_MANL_FLG")
    private String asgnManlFlg;
    @Column(name = "CTL_LOADING")
    private Long ctlLoading;
    @Column(name = "IN_WORK_RT_DT")
    private LocalDateTime inWorkRtDt;
    @Column(name = "RET_CAUSE_CD")
    private String retCauseCd;
    @Column(name = "X_FOUND_AMOUNT_CUR")
    private String xFoundAmountCur;
    @Column(name = "COMPLEXITY")
    private String complexity;
    @Column(name = "SM_STATUS")
    private String smStatus;
    @Column(name = "EXP_NUM")
    private String expNum;
    @Column(name = "EXT_QUEUE_ID")
    private String extQueueId;
    @Column(name = "DISTRIBUTION_DT")
    private LocalDateTime distributionDt;
    @Column(name = "IN_QUEUE_ID")
    private String inQueueId;
    @Column(name = "EXP_MODE")
    private String expMode;
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;
    @Column(name = "X_RATIONALE")
    private String xRationale;
    @Column(name = "X_FOUND_AMOUNT")
    private BigDecimal xFoundAmount;
    @Column(name = "TB_ID")
    private String tbId;
    @Column(name = "BEFORE_CLAIM_FLG")
    private String beforeClaimFlg;
    @Column(name = "STATUS_CD")
    private String statusCd;
    @Column(name = "ROUTE_START_DIV_ID")
    private String routeStartDivId;
    @Column(name = "RECEIVABLES_ACC")
    private String receivablesAcc;
    @Column(name = "ASGN_SYS_FLG")
    private String asgnSysFlg;
    @Column(name = "END_DT")
    private LocalDateTime endDt;
    @Column(name = "INCR_PACK_RUN_ID")
    private Long incrPackRunId;
}
