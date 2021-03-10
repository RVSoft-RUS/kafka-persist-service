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
@Table(name = "cx_txb_call_jrn", schema = "RAW_DATA_nrt")
public class CxTxbCallJrn {

    @Id
    private String rowId;
    private String xComment;
    private String txbActionId;
    private String tbName;
    private String tbCode;
    private LocalDateTime startDt;
    private String segment;
    private String result;
    private String product;
    private String osbId;
    private String organizationId;
    private BigDecimal modificationNum;
    private String managerId;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String gosbName;
    private String gosbCode;
    private String fioKm;
    private LocalDateTime endDt;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private String callType;
    private String activity;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;
}
