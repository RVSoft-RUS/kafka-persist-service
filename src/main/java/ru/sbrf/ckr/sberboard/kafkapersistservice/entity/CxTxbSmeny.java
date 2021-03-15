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
@Table(name = "CX_TXB_SMENY", schema = "RAW_DATA_NRT")
public class CxTxbSmeny {

    @Id
    private String rowId;
    private LocalDateTime xIAmFreeTime;
    private String xIAmFree;
    private LocalDateTime xFreezeEnd;
    private BigDecimal wedTo;
    private BigDecimal wedFrom;
    private String wedAct;
    private BigDecimal tueTo;
    private BigDecimal tueFrom;
    private String tueAct;
    private BigDecimal thurTo;
    private BigDecimal thurFrom;
    private String thurAct;
    private BigDecimal taskTime;
    private BigDecimal taskNum;
    private BigDecimal sunTo;
    private BigDecimal sunFrom;
    private String sunAct;
    private LocalDateTime startWorkNextDt;
    private LocalDateTime startWorkDt;
    private LocalDateTime startBreakDt;
    private LocalDateTime startBreak2Dt;
    private BigDecimal satTo;
    private BigDecimal satFrom;
    private String satAct;
    private String prDirectionId;
    private BigDecimal monTo;
    private BigDecimal monFrom;
    private String monAct;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private BigDecimal friTo;
    private BigDecimal friFrom;
    private String friAct;
    private LocalDateTime endWorkDt;
    private LocalDateTime endBreakDt;
    private LocalDateTime endBreak2Dt;
    private String empId;
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
