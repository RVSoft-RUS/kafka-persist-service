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
@Table(name = "cx_txb_hist", schema = "RAW_DATA_nrt")
public class CxTxbHist {

    @Id
    private String rowId;
    private String type;
    private String parRowId;
    private String oldValue;
    private String newValue;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String fieldName;
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
