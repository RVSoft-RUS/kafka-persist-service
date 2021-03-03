package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CrmTxbOrigin {

    private Long id;
    private String holding;
    private String txb_wait;
    private String emp_num;
    private LocalDateTime created;
    private String todo_cd;
    private String x_txb_prod;
    private String x_txb_act;
    private String evt_stat_cd;
    private String x_tlt_tb;
    private String target_ou_id;
    private String row_id;
    private String fio;
    private String aname;
    private String x_txb_code;
    private String x_tlt_osp;
    private LocalDateTime todo_plan_end_dt;
    private LocalDateTime todo_actl_start_dt;
    private LocalDateTime todo_actl_end_dt;
    private LocalDateTime appt_start_dt;
    private LocalDateTime appt_end_dt;
    private LocalDateTime todo_plan_start_dt;
    private LocalDateTime x_assign_dt;
    private LocalDateTime ch_wait_dt;
    private String x_tlt_org_name;
    private String x_act_code;
    private String x_sla_min;
    private String x_sla_min_clear;
    private String txb_code;
    private String second_in_expect_pp;
    private String second_in_expect_txb;
    private String segment;
    private String second_in_work;
    private String created_by_fio;
    private String created_by_emp_num;
    private String X_SERVICE_TYPE;
}
