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
@Table(name = "CX_TXB_HIST", schema = "RAW_DATA_NRT")
public class CxTxbHist {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    @Column(name = "type_")
    private String type;
    @Column(name = "par_Row_Id")
    private String parRowId;
    @Column(name = "old_Value")
    private String oldValue;
    @Column(name = "new_Value")
    private String newValue;
    @Column(name = "modification_Num")
    private BigDecimal modificationNum;
    @Column(name = "last_Upd_By")
    private String lastUpdBy;
    @Column(name = "last_Upd")
    private LocalDateTime lastUpd;
    @Column(name = "field_Name")
    private String fieldName;
    @Column(name = "db_Last_Upd_Src")
    private String dbLastUpdSrc;
    @Column(name = "db_Last_Upd")
    private LocalDateTime dbLastUpd;
    @Column(name = "created_By")
    private String createdBy;
    private LocalDateTime created;
    @Column(name = "conflict_Id")
    private String conflictId;
    @Column(name = "ctl_Validfrom")
    private LocalDateTime ctlValidfrom;
    @Column(name = "ctl_Action")
    private String ctlAction;
    @Column(name = "ctl_Loading")
    private Long ctlLoading;
    @Column(name = "ctl_Csn")
    private BigDecimal ctlCsn;
    @Column(name = "CTL_SEQNO")
    private Long ctlSeqno;

}
