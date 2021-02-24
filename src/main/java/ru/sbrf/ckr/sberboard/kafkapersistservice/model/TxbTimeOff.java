package ru.sbrf.ckr.sberboard.kafkapersistservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbTimeOff {

    private String row_id;
    private String name;
    private String reason;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private String emp_num;

}
