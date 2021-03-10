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
@Table(name = "cx_txb_list_lvl", schema = "RAW_DATA_nrt")
public class CxTxbListLvl {

    @Id
    private String rowId;
    private String xTemplateType;
    private BigDecimal xSlaMinClear;
    private BigDecimal xSlaMin;
    private String xSignTempl;
    private String xReqSign;
    private String xReqScan;
    private String xReqDoc;
    private String xPsfSbbolCode;
    private String xPriority;
    private String xParseEmailFlg;
    private BigDecimal xLevel;
    private String xKicCollection;
    private String xKicCashbox;
    private String xDirection;
    private String xDir;
    private String xDesc;
    private String xCodeType;
    private String xCode;
    private String xActiveFlg;
    private String visibilityKm;
    private String value;
    private String srProductName;
    private String prDirectionId;
    private String parRowId;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private String ccProductName;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;
}
