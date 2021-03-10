package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbTimeOff {

    private String rowId;
    private String name;
    private String reason;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String empNum;

}
