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
@Table(name = "CX_TXB_CALL_JRN", schema = "RAW_DATA_NRT")
public class CxTxbCallJrn {

    @Id
    @Column(name = "row_id")
    private String rowId;
    @Column(name = "x_comment")
    private String xComment;
    @Column(name = "txb_action_id")
    private String txbActionId;
    @Column(name = "tb_name")
    private String tbName;
    @Column(name = "tb_code")
    private String tbCode;
    @Column(name = "start_dt")
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
