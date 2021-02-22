create table if not exists raw_data_nrt.cx_txb_log_stat
(
    row_id varchar(50),
    created timestamp,
    created_by varchar(250),
    last_upd timestamp,
    last_upd_by varchar(150),
    modification_num varchar(50),
    conflict_id varchar(50),
    action_id varchar(50),
    change_dt timestamp,
    curr_status varchar(150),
    prev_status varchar(150),
    wait varchar(150)
);

alter table raw_data_nrt.cx_txb_log_stat owner to devstaging;
-------------------------------------------------------------
create table if not exists raw_data_nrt.TXB_DEPOSIT
(
    row_id varchar,
    created varchar,
    created_by varchar,
    archive_flg varchar,
    close_dt varchar,
    compl_dt varchar,
    dep_amt varchar,
    dep_end_dt varchar,
    accnt_id varchar,
    bank_name varchar,
    prod_type varchar,
    refusal_reason varchar,
    status varchar,
    exec_div_id varchar,
    scnd_line_ret_flg varchar,
    pprb_emp_name varchar,
    pprb_state_code varchar,
    emp_num varchar,
    fio varchar,
    tb varchar,
    date_start varchar,
    curr_status varchar,
    num_req_b_email varchar,
    num_req_txb varchar,
    seconds_in_work varchar,
    seconds_in_expect varchar,
    seconds_in_expect_pp varchar,
    seconds_in_expect_txb varchar,
    expect_dt varchar,
    x_act_code varchar,
    x_txb_code varchar,
    x_sla_min varchar,
    x_sla_min_clear varchar,
    segment varchar(250)
);

alter table raw_data_nrt.TXB_DEPOSIT owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.TXB_DEPOSIT_ORIGIN
(
    row_id varchar(50),
    created timestamp,
    created_by varchar(50),
    archive_flg varchar(1),
    close_dt timestamp,
    compl_dt timestamp,
    dep_amt varchar(50),
    dep_end_dt timestamp,
    accnt_id varchar(50),
    bank_name varchar(50),
    prod_type varchar(50),
    refusal_reason varchar(250),
    status varchar(50),
    exec_div_id varchar(50),
    scnd_line_ret_flg varchar(50),
    pprb_emp_name varchar(50),
    pprb_state_code varchar(50),
    emp_num varchar(50),
    fio varchar(50),
    tb varchar(50),
    date_start timestamp,
    curr_status varchar(50),
    num_req_b_email varchar(50),
    num_req_txb varchar(50),
    seconds_in_work bigint,
    seconds_in_expect bigint,
    seconds_in_expect_pp bigint,
    seconds_in_expect_txb bigint,
    expect_dt timestamp,
    x_act_code varchar(50),
    x_txb_code varchar(50),
    x_sla_min varchar(50),
    x_sla_min_clear varchar(50),
    segment varchar(250)
);

alter table raw_data_nrt.TXB_DEPOSIT_ORIGIN owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.TXB_LOG_STAT_N_REASON
(

    id bigint primary key,
    task_id varchar(50),
    change_date timestamp,
    reason varchar(255),
    status varchar(255)
);

alter table raw_data_nrt.TXB_LOG_STAT_N_REASON owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.TXB_RANKING
(
    name varchar,
    emp_id varchar,
    x_i_am_free char(1),
    x_i_am_free_time timestamp,
    x_freeze_end timestamp,
    start_work_dt timestamp,
    end_work_dt timestamp,
    start_break_dt timestamp,
    end_break_dt timestamp,
    task_time_cnt bigint,
    quotient numeric,
    update_time timestamp
);

alter table raw_data_nrt.TXB_RANKING owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.TXB_SCHEDULE
(
    row_id varchar(15),
    name varchar(1024),
    shift_date timestamp,
    shift_name varchar(200),
    shift_start timestamp,
    shift_end timestamp,
    break_start timestamp,
    break_end timestamp,
    emp_num varchar(50)
);

alter table raw_data_nrt.TXB_SCHEDULE owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.TXB_TIME_OFF
(
    row_id varchar(15),
    name varchar(1024),
    reason varchar(50),
    start_date timestamp,
    end_date timestamp,
    emp_num varchar(50)
);

alter table raw_data_nrt.TXB_TIME_OFF owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.CRM_TXB_origin
(
    id bigint primary key,
    holding varchar(150),
    txb_wait varchar(50),
    emp_num varchar(50),
    created timestamp,
    todo_cd varchar(50),
    x_txb_prod varchar(50),
    x_txb_act varchar(50),
    evt_stat_cd varchar(50),
    x_tlt_tb varchar(50),
    target_ou_id varchar(50),
    row_id varchar(50),
    fio varchar(50),
    aname varchar(50),
    x_txb_code varchar(50),
    x_tlt_osp varchar(50),
    todo_plan_end_dt timestamp,
    todo_actl_start_dt timestamp,
    todo_actl_end_dt timestamp,
    appt_start_dt timestamp,
    appt_end_dt timestamp,
    todo_plan_start_dt timestamp,
    x_assign_dt timestamp,
    ch_wait_dt timestamp,
    x_tlt_org_name varchar(250),
    x_act_code varchar(50),
    x_sla_min varchar(50),
    x_sla_min_clear varchar(50),
    txb_code varchar(50),
    second_in_expect_pp varchar(100),
    second_in_expect_txb varchar(100),
    segment varchar(255),
    second_in_work varchar(50),
    created_by_fio varchar(50),
    created_by_emp_num varchar(50),
    X_SERVICE_TYPE varchar(50)
);

alter table raw_data_nrt.CRM_TXB_origin owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.HOLIDAYS
(
    holiday timestamp
);

alter table raw_data_nrt.HOLIDAYS owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.x_tlttb
(
    id bigint primary key,
    GOSB_ID bigint,
    TIMEOFFSET bigint
);

alter table raw_data_nrt.x_tlttb owner to devstaging;

-------------------------------------------------------------
create table if not exists raw_data_nrt.Users
(
    id bigint primary key,
        FIO varchar(255),
        STRUCTURE varchar(255),
        RC varchar(255),
        MGT varchar(255),
        DEPT1 varchar(255),
        DEPT2 varchar(255),
        DEPT3 varchar(255),
        LAST_DEPT varchar(255),
        POSITION varchar(255),
        LOGIN_AVAYA bigint,
        TAB_ varchar(255),
        QUEUE varchar(255),
        MEDIAID varchar(255),
        FUNC_ROLE varchar(255),
        IS_STUDY varchar(50)
);

alter table raw_data_nrt.Users owner to devstaging;
