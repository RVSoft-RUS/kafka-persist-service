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
@Table(name = "cx_txb_call_jrn", schema = "RAW_DATA_nrt")
public class CxTxbCallJrn {

    private String x_comment;
    private String txb_action_id;
    private String tb_name;
    private String tb_code;
    private LocalDateTime start_dt;
    private String segment;
    @Id
    private String row_id;
    private String result;
    private String product;
    private String osb_id;
    private String organization_id;
    private BigDecimal modification_num;
    private String manager_id;
    private String last_upd_by;
    private LocalDateTime last_upd;
    private String gosb_name;
    private String gosb_code;
    private String fio_km;
    private LocalDateTime end_dt;
    private String db_last_upd_src;
    private LocalDateTime db_last_upd;
    private String created_by;
    private LocalDateTime created;
    private String conflict_id;
    private String call_type;
    private String activity;
    private LocalDateTime ctl_validfrom;
    private String ctl_action;
    private Long ctl_loading;
    private BigDecimal ctl_csn;


}
