package ru.sbrf.ckr.sberboard.kafkapersistservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbRanking {

    private String name;
    private String emp_id;
    private String x_i_am_free;
    private LocalDateTime x_i_am_free_time;
    private LocalDateTime x_freeze_end;
    private LocalDateTime start_work_dt;
    private LocalDateTime end_work_dt;
    private LocalDateTime start_break_dt;
    private LocalDateTime end_break_dt;
    private Long task_time_cnt;
    private Float quotient;
    private LocalDateTime update_time;

}
