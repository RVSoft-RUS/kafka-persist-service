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

    private String action_id;
    private LocalDateTime change_dt;
    private String conflict_id;
    private LocalDateTime created;
    private String created_by;
    private String curr_status;
    private String db_last_upd_src;
    private LocalDateTime db_last_upd;
    private LocalDateTime last_upd;
    private String last_upd_by;
    private String modification_num;
    private String prev_status;
    @Id
    private String row_id;
    private String wait;
    private String ctl_action;
    private BigDecimal ctl_csn;
    private Long ctl_loading;
    private Long ctl_seqno;
    private LocalDateTime ctl_validfrom;


}
