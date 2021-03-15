package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TxbDepositOrigin {

    private String rowId;
    private LocalDateTime created;
    private String createdBy;
    private String archiveFlg;
    private LocalDateTime closeDt;
    private LocalDateTime complDt;
    private String depAmt;
    private LocalDateTime depEndDt;
    private String accntId;
    private String bankName;
    private String prodType;
    private String refusalReason;
    private String status;
    private String execDivId;
    private String scndLineRetFlg;
    private String pprbEmpName;
    private String pprbStateCode;
    private String empNum;
    private String fio;
    private LocalDateTime dateStart;
    private String currStatus;
    private String numReqBEmail;
    private String numReqTxb;
    private Long secondsInWork;
    private Long secondsInExpect;
    private Long secondsInExpectPp;
    private Long secondsInExpectTxb;
    private LocalDateTime expectDt;
    private String xActCode;
    private String xTxbCode;
    private String xSlaMin;
    private String xSlaMinClear;
    private String segment;

}
