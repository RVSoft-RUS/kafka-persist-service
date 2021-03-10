package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbLogStatNReason {

    private Long id;
    private String taskId;
    private LocalDateTime changeDate;
    private String reason;
    private String status;

}
