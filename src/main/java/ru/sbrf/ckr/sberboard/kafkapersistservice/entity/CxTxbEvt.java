package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CX_TXB_EVT", schema = "RAW_DATA_NRT")
public class CxTxbEvt {

    @Id
    private String rowId;
    private String zp;
    private String xTxbSource;
    private String xTxbProd;
    private String xTxbOrgType;
    private String xTxbKicSubtype;
    private String xTxbContNumb;
    private String xTxbContFio;
    private String xTxbCodeId;
    private String xTxbCode;
    private String xTxbAct;
    private String xTltVsp;
    private LocalDateTime xTltToVkoDt;
    private String xTltTb;
    private LocalDateTime xTltReservDt;
    private String xTltReason;
    private String xTltOsp;
    private String xTltOrgName;
    private String xTltMsc2Res;
    private LocalDateTime xTltMsc2Dt;
    private String xTltMsc1Res;
    private String xTltInn;
    private String xTltAgrNum;
    private LocalDateTime xTltAgrDate;
    private String xSignType;
    private String xSgType;
    private String xSgTemplType;
    private String xSgNumber;
    private String xSgMidName;
    private String xSgMidClName;
    private String xSgLstName;
    private String xSgLstClName;
    private String xSgJobTitle;
    private String xSgJobClTitle;
    private String xSgFullName;
    private String xSgFstName;
    private String xSgFstClName;
    private String xSgDoc;
    private LocalDateTime xSgDate;
    private String xSgClNumber;
    private String xSgClFullName;
    private String xSgClDoc;
    private LocalDateTime xSgClDate;
    private BigDecimal xSbrfWkHDurAct;
    private BigDecimal xSbrfWkHDur;
    private String xRpaFlag;
    private String xRpaComment;
    private String xReqSign;
    private String xReqScan;
    private String xReqDoc;
    private String xOperationUid;
    private String xNewProdFlg;
    private String xKicOcCity;
    private String xKicDivnId;
    private String xIndicator;
    private String xIcSpec;
    private String xIcReason;
    private String xIcJudgement;
    private String xIcComment;
    private String xExCreatedBy;
    private String xExperticeId;
    private String xDoc;
    private String xDelegatedFlg;
    private String xCondition;
    private String xClientIt;
    private String xClientCount;
    private LocalDateTime xAssignDt;
    private String xActSource;
    private String xActCode;
    private BigDecimal workRemainMin;
    private LocalDateTime waitChangeDt;
    private String txbWait;
    private LocalDateTime todoPlanStartDt;
    private LocalDateTime todoPlanEndDt;
    private String todoCd;
    private LocalDateTime todoAfterDt;
    private LocalDateTime todoActlStartDt;
    private LocalDateTime todoActlEndDt;
    private String te;
    private String targetPerId;
    private String targetOuId;
    private String stL;
    private LocalDateTime stage2Start;
    private LocalDateTime stage1Start;
    private String sentBbmoFlg;
    private BigDecimal sbrfDurationPlannedMin;
    private String sbrfCgId;
    private String sbbolLogin;
    private String sbbolFlg;
    private String result;
    private String regAddress;
    private String prSrId;
    private String priorityCd;
    private String prevActId;
    private String pprbAgrId;
    private BigDecimal pctComplete;
    private String parActId;
    private String ownerPostnId;
    private String ownerPerId;
    private String ownerLogin;
    private String optyId;
    private String name;
    private String mvd;
    private String mshReleaseId;
    private String mshProdId;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String kmVisibility;
    private String kicFlg;
    private String framesFlg;
    private String evtStatCd;
    private String ecmTdkkbId;
    private BigDecimal durationHrs;
    private String doneFlg;
    private LocalDateTime delayToDt;
    private String decision;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private String collectFlg;
    private String cashAgreemId;
    private String bi;
    private String autoCloseIncFlg;
    private String autoCloseFlg;
    private LocalDateTime apptStartDt;
    private String apptReptType;
    private String apptReptReplCd;
    private String apptReptFlg;
    private LocalDateTime apptReptEndDt;
    private BigDecimal apptEndTm;
    private LocalDateTime apptEndDt;
    private BigDecimal apptDurationMin;
    private BigDecimal apptAlarmTmMin;
    private String alarmFlag;
    private String agreemNum;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;

}
