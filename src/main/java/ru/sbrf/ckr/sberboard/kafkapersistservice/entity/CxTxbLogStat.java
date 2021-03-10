package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cx_txb_log_stat", schema = "RAW_DATA_nrt")
public class CxTxbLogStat implements Serializable {
    @Id
    private String rowId;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime lastUpd;
    private String  dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String lastUpdBy;
    private String modificationNum;
    private String conflictId;
    private String actionId;
    private LocalDateTime changeDt;
    private String currStatus;
    private String prevStatus;
    private String wait;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;
}
