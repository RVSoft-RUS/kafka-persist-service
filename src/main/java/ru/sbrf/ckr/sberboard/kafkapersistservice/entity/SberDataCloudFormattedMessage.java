package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SberDataCloudFormattedMessage implements Serializable {

    private String table;
    private String op_type;
    private LocalDateTime op_ts;
    private LocalDateTime current_ts;
    private String pos;
    private CxTxbLogStat before;
    private CxTxbLogStat after;

}