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

    private String type;
    @Id
    private String row_id;
    private String par_row_id;
    private String old_value;
    private String new_value;
    private BigDecimal modification_num;
    private String last_upd_by;
    private LocalDateTime last_upd;
    private String field_name;
    private String db_last_upd_src;
    private LocalDateTime db_last_upd;
    private String created_by;
    private LocalDateTime created;
    private String conflict_id;
    private LocalDateTime ctl_validfrom;
    private String ctl_action;
    private Long ctl_loading;
    private BigDecimal ctl_csn;
}
