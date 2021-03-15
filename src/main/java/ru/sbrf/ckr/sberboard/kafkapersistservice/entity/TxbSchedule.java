package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbSchedule {

    private String rowId;
    private String name;
    private LocalDateTime shiftDate;
    private String shiftName;
    private LocalDateTime shiftStart;
    private LocalDateTime shiftEnd;
    private LocalDateTime breakStart;
    private LocalDateTime breakEnd;
    private String empNum;

}
