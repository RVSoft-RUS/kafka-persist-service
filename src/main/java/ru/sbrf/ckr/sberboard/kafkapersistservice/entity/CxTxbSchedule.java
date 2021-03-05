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
@Table(name = "cx_txb_schedule", schema = "RAW_DATA_nrt")
public class CxTxbSchedule {

    private BigDecimal shift_start;
    private String shift_name;
    private BigDecimal shift_end;
    private LocalDateTime shift_date;
    @Id
    private String row_id;
    private String par_row_id;
    private BigDecimal modification_num;
    private String last_upd_by;
    private LocalDateTime last_upd;
    private String db_last_upd_src;
    private LocalDateTime db_last_upd;
    private String created_by;
    private LocalDateTime created;
    private String conflict_id;
    private BigDecimal break_start;
    private BigDecimal break_end;
    private BigDecimal break2_start;
    private BigDecimal break2_end;
    private LocalDateTime ctl_validfrom;
    private String ctl_action;
    private Long ctl_loading;
    private BigDecimal ctl_csn;
}
