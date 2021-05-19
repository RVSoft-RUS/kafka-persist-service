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
@Table(name = "S_SRV_REQ_X", schema = "RAW_DATA_NRT")
public class SSrvReqX {
    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    private LocalDateTime created;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "LAST_UPD")
    private LocalDateTime lastUpd;
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;
    @Column(name = "MODIFICATION_NUM")
    private BigDecimal modificationNum;
    @Column(name = "CONFLICT_ID")
    private String conflictId;
    @Column(name = "PAR_ROW_ID")
    private String parRowId;
    @Column(name = "ATTRIB_08")
    private String attrib08;
    @Column(name = "ATTRIB_09")
    private String attrib09;
    @Column(name = "ATTRIB_10")
    private String attrib10;
    @Column(name = "ATTRIB_11")
    private String attrib11;
    @Column(name = "ATTRIB_12")
    private LocalDateTime attrib12;
    @Column(name = "ATTRIB_13")
    private LocalDateTime attrib13;
    @Column(name = "ATTRIB_14")
    private BigDecimal attrib14;
    @Column(name = "ATTRIB_15")
    private BigDecimal attrib15;
    @Column(name = "ATTRIB_16")
    private BigDecimal attrib16;
    @Column(name = "ATTRIB_17")
    private BigDecimal attrib17;
    @Column(name = "ATTRIB_18")
    private BigDecimal attrib18;
    @Column(name = "ATTRIB_19")
    private BigDecimal attrib19;
    @Column(name = "ATTRIB_20")
    private BigDecimal attrib20;
    @Column(name = "ATTRIB_21")
    private BigDecimal attrib21;
    @Column(name = "ATTRIB_22")
    private BigDecimal attrib22;
    @Column(name = "ATTRIB_23")
    private BigDecimal attrib23;
    @Column(name = "ATTRIB_24")
    private BigDecimal attrib24;
    @Column(name = "ATTRIB_25")
    private BigDecimal attrib25;
    @Column(name = "ATTRIB_26")
    private LocalDateTime attrib26;
    @Column(name = "ATTRIB_27")
    private LocalDateTime attrib27;
    @Column(name = "ATTRIB_28")
    private LocalDateTime attrib28;
    @Column(name = "ATTRIB_29")
    private LocalDateTime attrib29;
    @Column(name = "ATTRIB_30")
    private LocalDateTime attrib30;
    @Column(name = "ATTRIB_31")
    private LocalDateTime attrib31;
    @Column(name = "ATTRIB_32")
    private LocalDateTime attrib32;
    @Column(name = "ATTRIB_33")
    private LocalDateTime attrib33;
    @Column(name = "DB_LAST_UPD")
    private LocalDateTime dbLastUpd;
    @Column(name = "ATTRIB_01")
    private String attrib01;
    @Column(name = "ATTRIB_02")
    private String attrib02;
    @Column(name = "ATTRIB_03")
    private String attrib03;
    @Column(name = "ATTRIB_04")
    private String attrib04;
    @Column(name = "ATTRIB_05")
    private String attrib05;
    @Column(name = "ATTRIB_06")
    private String attrib06;
    @Column(name = "ATTRIB_07")
    private String attrib07;
    @Column(name = "ATTRIB_34")
    private String attrib34;
    @Column(name = "ATTRIB_35")
    private String attrib35;
    @Column(name = "ATTRIB_36")
    private String attrib36;
    @Column(name = "ATTRIB_37")
    private String attrib37;
    @Column(name = "ATTRIB_38")
    private String attrib38;
    @Column(name = "ATTRIB_39")
    private String attrib39;
    @Column(name = "ATTRIB_40")
    private String attrib40;
    @Column(name = "ATTRIB_41")
    private String attrib41;
    @Column(name = "ATTRIB_42")
    private String attrib42;
    @Column(name = "ATTRIB_43")
    private String attrib43;
    @Column(name = "ATTRIB_44")
    private String attrib44;
    @Column(name = "ATTRIB_45")
    private String attrib45;
    @Column(name = "ATTRIB_46")
    private String attrib46;
    @Column(name = "ATTRIB_47")
    private String attrib47;
    @Column(name = "DB_LAST_UPD_SRC")
    private String dbLastUpdSrc;
    @Column(name = "BIG_DESC")
    private String bigDesc;
    @Column(name = "REPLY_TEXT")
    private String replyText;
    @Column(name = "SR_ACCOUNT_NAME")
    private String srAccountName;
    @Column(name = "SR_CARD_NUM")
    private String srCardNum;
    @Column(name = "SR_CHILD_NUM")
    private BigDecimal srChildNum;
    @Column(name = "SR_CONTACT_EMAIL")
    private String srContactEmail;
    @Column(name = "SR_DEVICE_ADDR")
    private String srDeviceAddr;
    @Column(name = "SR_DEVICE_NUM")
    private String srDeviceNum;
    @Column(name = "SR_GROUP")
    private String srGroup;
    @Column(name = "SR_ID")
    private String srId;
    @Column(name = "SR_ID_NUM_PART")
    private BigDecimal srIdNumPart;
    @Column(name = "SR_IDENTIFY")
    private String srIdentify;
    @Column(name = "SR_MOBILE_PHONE")
    private String srMobilePhone;
    @Column(name = "SR_PASS_REASON")
    private String srPassReason;
    @Column(name = "SR_PRODUCT")
    private String srProduct;
    @Column(name = "SR_REASON")
    private String srReason;
    @Column(name = "SR_RECEIVE_RESPONSE")
    private String srReceiveResponse;
    @Column(name = "SR_RESULT")
    private String srResult;
    @Column(name = "SR_SERVICE")
    private String srService;
    @Column(name = "SR_SERVICE_PLACE")
    private String srServicePlace;
    @Column(name = "SR_SOURCE_TYPE")
    private String srSourceType;
    @Column(name = "SR_TYPE")
    private String srType;
    @Column(name = "SR_WORK_PHONE")
    private String srWorkPhone;
    @Column(name = "ACCNT_KPP")
    private String accntKpp;
    @Column(name = "ACCNT_NAME")
    private String accntName;
    @Column(name = "BEFORE_CLAIM_FLG")
    private String beforeClaimFlg;
    @Column(name = "EXEC_COMMENT")
    private String execComment;
    @Column(name = "OPER_COMMENT")
    private String operComment;
    @Column(name = "PP_ANSWER")
    private String ppAnswer;
    @Column(name = "PP_ANSWER_DT")
    private LocalDateTime ppAnswerDt;
    @Column(name = "PP_EMP_NAME")
    private String ppEmpName;
    @Column(name = "PP_NAME")
    private String ppName;
    @Column(name = "PP_REQUEST")
    private String ppRequest;
    @Column(name = "PP_REQUEST_DT")
    private LocalDateTime ppRequestDt;
    @Column(name = "REPAY_AMT")
    private BigDecimal repayAmt;
    @Column(name = "REPAY_CURCY_CD")
    private String repayCurcyCd;
    @Column(name = "SR_EMP_NAME")
    private String srEmpName;
    @Column(name = "SR_FN_FOLDER01_ID")
    private String srFnFolder01Id;
    @Column(name = "SR_FN_FOLDER02_ID")
    private String srFnFolder02Id;
    @Column(name = "SR_FN_FOLDER03_ID")
    private String srFnFolder03Id;
    @Column(name = "SR_FN_FOLDER04_ID")
    private String srFnFolder04Id;
    @Column(name = "SR_FN_FOLDER05_ID")
    private String srFnFolder05Id;
    @Column(name = "SR_FN_FOLDER_ID")
    private String srFnFolderId;
    @Column(name = "SR_INPUT_TYPE")
    private String srInputType;
    @Column(name = "SR_RECLASS_REASON")
    private String srReclassReason;
    @Column(name = "SR_ROOTCAUSE")
    private String srRootcause;
    @Column(name = "SR_STAGE")
    private String srStage;
    @Column(name = "SUPER_COMMENT")
    private String superComment;
    @Column(name = "SR_DAYS_LEFT")
    private BigDecimal srDaysLeft;
    @Column(name = "SR_CC_NAME")
    private String srCcName;
    @Column(name = "SR_CON_BIRTH_DT")
    private LocalDateTime srConBirthDt;
    @Column(name = "ANSWER_CLOB")
    private String answerClob;
    @Column(name = "REOPEN_DATE")
    private LocalDateTime reopenDate;
    @Column(name = "REOPEN_FLAG")
    private String reopenFlag;
    @Column(name = "REOPEN_REASON")
    private String reopenReason;
    @Column(name = "SPNAME")
    private String spname;
    @Column(name = "X_OPERATION_UID")
    private String xOperationUid;
    @Column(name = "X_REG_COMM_FLG")
    private String xRegCommFlg;
    @Column(name = "X_EXTERNAL_LOGIN")
    private String xExternalLogin;
    @Column(name = "SRV_GRP_ID")
    private String srvGrpId;
    @Column(name = "X_SIMPLE_SCHEME")
    private String xSimpleScheme;
    @Column(name = "ANSW_TMPL_ID")
    private String answTmplId;
    @Column(name = "X_BTC_FLG")
    private String xBtcFlg;
    @Column(name = "X_COMPLIANCE")
    private String xCompliance;
    @Column(name = "X_INCIDENT")
    private String xIncident;
    @Column(name = "X_INSURANCE_FLG")
    private String xInsuranceFlg;
    @Column(name = "X_SOLICITATION_FLG")
    private String xSolicitationFlg;
    @Column(name = "X_STOP_FLG")
    private String xStopFlg;
    @Column(name = "PSF_THEME")
    private String psfTheme;
    @Column(name = "PSF_EXEC_DIV_ID")
    private String psfExecDivId;
    @Column(name = "PSF_MANUAL_FLG")
    private String psfManualFlg;
    @Column(name = "PSF_RETURN_FLG")
    private String psfReturnFlg;
    @Column(name = "PSF_TYPE")
    private String psfType;
    @Column(name = "PSF_TIME_UOM_CD")
    private String psfTimeUomCd;
    @Column(name = "PSF_TOTAL_TIME")
    private BigDecimal psfTotalTime;
    @Column(name = "X_QUE_IN_WORK_DT")
    private LocalDateTime xQueInWorkDt;
    @Column(name = "X_ACCOUNT_NUM_ID")
    private String xAccountNumId;
    @Column(name = "X_QUE_COMMENT")
    private String xQueComment;
    @Column(name = "X_QUE_RET_EXEC_FLG")
    private String xQueRetExecFlg;
    @Column(name = "X_QUE_DT")
    private LocalDateTime xQueDt;
    @Column(name = "MASTER_SR_ID")
    private String masterSrId;
    @Column(name = "X_QUE_MANUAL_FLG")
    private String xQueManualFlg;
    @Column(name = "SR_DEVICE_TB_ID")
    private String srDeviceTbId;
    @Column(name = "X_QUE_PAR_DT")
    private LocalDateTime xQueParDt;
    @Column(name = "X_QUEUE_ID")
    private String xQueueId;
    @Column(name = "X_QUE_RET_QUE_FLG")
    private String xQueRetQueFlg;
    @Column(name = "X_ACCOUNT_BANK_ID")
    private String xAccountBankId;
    @Column(name = "SR_REPEATED_REASON")
    private String srRepeatedReason;
    @Column(name = "X_SM_EXECUTOR")
    private String xSmExecutor;
    @Column(name = "X_SM_WORKING_GROUP")
    private String xSmWorkingGroup;
    @Column(name = "X_PSF_ROUTE")
    private String xPsfRoute;
    @Column(name = "X_TLA_DATE_END_ONE")
    private LocalDateTime xTlaDateEndOne;
    @Column(name = "X_SM_ZNO_ID")
    private String xSmZnoId;
    @Column(name = "X_TLA_DATE_END_TWO")
    private LocalDateTime xTlaDateEndTwo;
    @Column(name = "PSF_VSP_NAME")
    private String psfVspName;
    @Column(name = "PSF_TB_ID")
    private String psfTbId;
    @Column(name = "X_CHECK_FLAG")
    private String xCheckFlag;
    @Column(name = "RETAIL_OUT_QUEST_NUM")
    private String retailOutQuestNum;
    @Column(name = "RETAIL_CREATED_DATE")
    private LocalDateTime retailCreatedDate;
    @Column(name = "RETAIL_OUT_SR_NUM")
    private String retailOutSrNum;
    @Column(name = "RETAIL_IN_QUEST_NUM")
    private String retailInQuestNum;
    @Column(name = "RETAIL_IN_SR_NUM")
    private String retailInSrNum;
    @Column(name = "X_ML_CLASS")
    private String xMlClass;
    @Column(name = "X_ML_DEPTH")
    private BigDecimal xMlDepth;
    @Column(name = "X_ML_PERC")
    private BigDecimal xMlPerc;
    @Column(name = "INT_MASTER_SR_ID")
    private String intMasterSrId;
    @Column(name = "X_CHECK_RESULT")
    private String xCheckResult;
    @Column(name = "X_CONTRIBUTOR_FIO")
    private String xContributorFio;
    @Column(name = "X_EKS_ID_CHECK_FLAG")
    private String xEksIdCheckFlag;
    @Column(name = "X_CONTRIBUTOR_ID")
    private String xContributorId;
    @Column(name = "X_AUTO_REVIEW_FLAG")
    private String xAutoReviewFlag;
    @Column(name = "X_AUTO_REVIEW_METHOD")
    private String xAutoReviewMethod;
    @Column(name = "X_DECISION")
    private String xDecision;
    @Column(name = "X_RECEIPT_ORDER")
    private String xReceiptOrder;
    @Column(name = "DISTRIBUTION_DATE")
    private LocalDateTime distributionDate;
    @Column(name = "X_JUSTIFICATION")
    private String xJustification;
    @Column(name = "PSF_SBBOL_NUM")
    private String psfSbbolNum;
    @Column(name = "X_RPA_STATUS")
    private String xRpaStatus;
    @Column(name = "COMPENSATION_TYPE")
    private String compensationType;
    @Column(name = "COMPENSATION_TECH_INFO")
    private String compensationTechInfo;
    @Column(name = "COMPENSATION_REFUSE_FLAG")
    private String compensationRefuseFlag;
    @Column(name = "COMPENSATION_REFUSAL_REASON")
    private String compensationRefusalReason;
    @Column(name = "COMPENSATION_RQ_DT")
    private LocalDateTime compensationRqDt;
    @Column(name = "REMOVE_SR_FROM_EMP_LOAD")
    private String removeSrFromEmpLoad;
    @Column(name = "COMPENSATION_REFUSAL_DESC")
    private String compensationRefusalDesc;
    @Column(name = "APPL_COMPEN_FLG")
    private String applCompenFlg;
    @Column(name = "SEND_SBBOL_ERR_FLG")
    private String sendSbbolErrFlg;
    @Column(name = "X_EFS_ID")
    private String xEfsId;
    @Column(name = "X_PSF_INQUIRY_FLG")
    private String xPsfInquiryFlg;
}