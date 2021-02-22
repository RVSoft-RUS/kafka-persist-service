package com.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbLogStatNReason {

    private Long id;
    private String task_id;
    private LocalDateTime change_date;
    private String reason;
    private String status;

}
