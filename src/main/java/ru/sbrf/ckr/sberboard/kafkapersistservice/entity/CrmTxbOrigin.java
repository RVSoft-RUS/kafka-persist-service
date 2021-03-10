package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CrmTxbOrigin {

    private Long id;
    private String holding;
    private String txbWait;
    private String empNum;
    private LocalDateTime created;
    private String todoCd;
    private String xTxbProd;
    private String xTxbAct;
    private String evtStatCd;
    private String xTltTb;
    private String targetOuId;
    private String rowId;
    private String fio;
    private String aname;
    private String xTxbCode;
    private String xTltOsp;
    private LocalDateTime todoPlanEndDt;
    private LocalDateTime todoActlStartDt;
    private LocalDateTime todoActlEndDt;
    private LocalDateTime apptStartDt;
    private LocalDateTime apptEndDt;
    private LocalDateTime todoPlanStartDt;
    private LocalDateTime xAssignDt;
    private LocalDateTime chWaitDt;
    private String xTltOrgName;
    private String xActCode;
    private String xSlaMin;
    private String xSlaMinClear;
    private String txbCode;
    private String secondInExpectPp;
    private String secondInExpectTxb;
    private String segment;
    private String secondInWork;
    private String createdByFio;
    private String createdByEmpNum;
    private String xServiceType;
}
