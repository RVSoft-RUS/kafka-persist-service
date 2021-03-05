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
@Table(name = "cx_txb_smeny", schema = "RAW_DATA_nrt")
public class CxTxbSmeny {

    private LocalDateTime x_i_am_free_time;
    private String x_i_am_free;
    private LocalDateTime x_freeze_end;
    private BigDecimal wed_to;
    private BigDecimal wed_from;
    private String wed_act;
    private BigDecimal tue_to;
    private BigDecimal tue_from;
    private String tue_act;
    private BigDecimal thur_to;
    private BigDecimal thur_from;
    private String thur_act;
    private BigDecimal task_time;
    private BigDecimal task_num;
    private BigDecimal sun_to;
    private BigDecimal sun_from;
    private String sun_act;
    private LocalDateTime start_work_next_dt;
    private LocalDateTime start_work_dt;
    private LocalDateTime start_break_dt;
    private LocalDateTime start_break2_dt;
    private BigDecimal sat_to;
    private BigDecimal sat_from;
    private String sat_act;
    @Id
    private String row_id;
    private String pr_direction_id;
    private BigDecimal mon_to;
    private BigDecimal mon_from;
    private String mon_act;
    private BigDecimal modification_num;
    private String last_upd_by;
    private LocalDateTime last_upd;
    private BigDecimal fri_to;
    private BigDecimal fri_from;
    private String fri_act;
    private LocalDateTime end_work_dt;
    private LocalDateTime end_break_dt;
    private LocalDateTime end_break2_dt;
    private String emp_id;
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
