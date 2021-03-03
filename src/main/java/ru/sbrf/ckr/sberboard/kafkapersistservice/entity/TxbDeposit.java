package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TxbDeposit {

    private String row_id;
    private String created;
    private String created_by;
    private String archive_flg;
    private String close_dt;
    private String compl_dt;
    private String dep_amt;
    private String dep_end_dt;
    private String accnt_id;
    private String bank_name;
    private String prod_type;
    private String refusal_reason;
    private String status;
    private String exec_div_id;
    private String scnd_line_ret_flg;
    private String pprb_emp_name;
    private String pprb_state_code;
    private String emp_num;
    private String fio;
    private String tb;
    private String date_start;
    private String curr_status;
    private String num_req_b_email;
    private String num_req_txb;
    private String seconds_in_work;
    private String seconds_in_expect;
    private String seconds_in_expect_pp;
    private String seconds_in_expect_txb;
    private String expect_dt;
    private String x_act_code;
    private String x_txb_code;
    private String x_sla_min;
    private String x_sla_min_clear;
    private String segment;
}
