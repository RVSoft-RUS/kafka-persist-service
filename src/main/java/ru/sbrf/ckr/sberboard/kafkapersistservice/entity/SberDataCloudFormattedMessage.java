package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SberDataCloudFormattedMessage<T> implements Serializable {

    private String table;
    private String opType;
    private LocalDateTime opTs;
    private LocalDateTime currentTs;
    private String pos;
    private T before;
    private T after;

}