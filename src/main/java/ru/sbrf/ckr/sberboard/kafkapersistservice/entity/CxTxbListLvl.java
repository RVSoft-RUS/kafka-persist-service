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
@Table(name = "cx_txb_list_lvl", schema = "RAW_DATA_nrt")
public class CxTxbListLvl {


    private String x_template_type;
    private BigDecimal x_sla_min_clear;
    private BigDecimal x_sla_min;
    private String x_sign_templ;
    private String x_req_sign;
    private String x_req_scan;
    private String x_req_doc;
    private String x_psf_sbbol_code;
    private String x_priority;
    private String x_parse_email_flg;
    private BigDecimal x_level;
    private String x_kic_collection;
    private String x_kic_cashbox;
    private String x_direction;
    private String x_dir;
    private String x_desc;
    private String x_code_type;
    private String x_code;
    private String x_active_flg;
    private String visibility_km;
    private String value;
    private String sr_product_name;
    @Id
    private String row_id;
    private String pr_direction_id;
    private String par_row_id;
    private BigDecimal modification_num;
    private String last_upd_by;
    private LocalDateTime last_upd;
    private String db_last_upd_src;
    private LocalDateTime db_last_upd;
    private String created_by;
    private LocalDateTime created;
    private String conflict_id;
    private String cc_product_name;
    private LocalDateTime ctl_validfrom;
    private String ctl_action;
    private Long ctl_loading;
    private BigDecimal ctl_csn;

}
