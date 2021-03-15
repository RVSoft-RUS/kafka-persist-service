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
@Table(name = "CX_TXB_SCHEDULE", schema = "RAW_DATA_NRT")
public class CxTxbSchedule {

    @Id
    private String rowId;
    private BigDecimal shiftStart;
    private String shiftName;
    private BigDecimal shiftEnd;
    private LocalDateTime shiftDate;
    private String parRowId;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private BigDecimal breakStart;
    private BigDecimal breakEnd;
    private BigDecimal break2Start;
    private BigDecimal break2End;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;
}
