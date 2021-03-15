package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SberDataCloudFormattedMessage<T> implements Serializable {

    private String table;
    private String op_type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime op_ts;
    private LocalDateTime current_ts;
    private String pos;
    private T before;
    private T after;

}