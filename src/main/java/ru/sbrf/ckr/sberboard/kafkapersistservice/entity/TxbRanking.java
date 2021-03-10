package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbRanking {

    private String name;
    private String empId;
    private String xIAmFree;
    private LocalDateTime xIAmFreeTime;
    private LocalDateTime xFreezeEnd;
    private LocalDateTime startWorkDt;
    private LocalDateTime endWorkDt;
    private LocalDateTime startBreakDt;
    private LocalDateTime endBreakDt;
    private Long taskTimeCnt;
    private Float quotient;
    private LocalDateTime updateTime;

}
