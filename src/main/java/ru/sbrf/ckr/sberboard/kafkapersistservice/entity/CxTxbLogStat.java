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
@Table(name = "CX_TXB_LOG_STAT", schema = "RAW_DATA_NRT")
public class CxTxbLogStat extends MessageObject {
    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    @Column(name = "action_Id")
    private String actionId;
    @Column(name = "change_Dt")
    private LocalDateTime changeDt;
    @Column(name = "conflict_Id")
    private String conflictId;
    private LocalDateTime created;
    @Column(name = "created_By")
    private String createdBy;
    @Column(name = "curr_Status")
    private String currStatus;
    @Column(name = "db_Last_Upd_Src")
    private String  dbLastUpdSrc;
    @Column(name = "db_Last_Upd")
    private LocalDateTime dbLastUpd;
    @Column(name = "last_Upd")
    private LocalDateTime lastUpd;
    @Column(name = "last_Upd_By")
    private String lastUpdBy;
    @Column(name = "modification_Num")
    private BigDecimal modificationNum;
    @Column(name = "prev_Status")
    private String prevStatus;
    private String wait;
    @Column(name = "ctl_Action")
    private String ctlAction;
    @Column(name = "ctl_Csn")
    private BigDecimal ctlCsn;
    @Column(name = "ctl_Loading")
    private Long ctlLoading;
    @Column(name = "ctl_Seqno")
    private Long ctlSeqno;
    @Column(name = "ctl_Validfrom")
    private LocalDateTime ctlValidfrom;
}
