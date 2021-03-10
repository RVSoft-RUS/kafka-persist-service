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
@Table(name = "cx_txb_time_off", schema = "RAW_DATA_nrt")
public class CxTxbTimeOff {
    @Id
    private String rowId;
    private LocalDateTime startDate;
    private String reason;
    private String parRowId;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private LocalDateTime endDate;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;
}
