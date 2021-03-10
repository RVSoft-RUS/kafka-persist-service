package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TxbDeposit {

    private String rowId;
    private String created;
    private String createdBy;
    private String archiveFlg;
    private String closeDt;
    private String complDt;
    private String depAmt;
    private String depEndDt;
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
    private String tb;
    private String dateStart;
    private String currStatus;
    private String numReqBEmail;
    private String numReqTxb;
    private String secondsInWork;
    private String secondsInexpect;
    private String secondsInexpectPp;
    private String secondsInexpectTxb;
    private String expectDt;
    private String xActCode;
    private String xTxbCode;
    private String xSlaMin;
    private String xSlaMinClear;
    private String segment;
}
