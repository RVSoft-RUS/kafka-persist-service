package ru.sbrf.ckr.sberboard.kafkapersistservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbSchedule {

    private String row_id;
    private String name;
    private LocalDateTime shift_date;
    private String shift_name;
    private LocalDateTime shift_start;
    private LocalDateTime shift_end;
    private LocalDateTime break_start;
    private LocalDateTime break_end;
    private String emp_num;

}
