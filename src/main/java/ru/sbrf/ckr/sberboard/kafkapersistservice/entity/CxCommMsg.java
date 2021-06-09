package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CX_COMM_MSG", schema = "RAW_DATA_NRT")
public class CxCommMsg extends MessageObject {
    @Column (name = "STATUS")
    private String status;
    @Column(name = "START_TIME")
    private LocalDateTime startTime;
    @Column (name = "COMM_TEMPLATE_NAME")
    private String commTemplateName;
    @Column (name = "ERROR_TEXT")
    private String errorText;
    @Column (name = "INTEGRATION_TYPE")
    private String integrationType;
    @Column (name = "TRANSMIT_STATUS")
    private String transmitStatus;
    @Column (name = "LAST_UPD_BY")
    private String lastUpdBy;
    @Column (name = "CTL_ACTION")
    private String ctlAction;
    @Column (name = "OBJECT_ID")
    private String objectId;
    @Column(name = "LAST_UPD")
    private LocalDateTime lastUpd;
    @Column (name = "ENQUEUE_STATUS")
    private String enqueueStatus;
    @Column (name = "EMP_ID")
    private String empId;
    @Column (name = "CONFLICT_ID")
    private String conflictId;
    @Column (name = "MESSAGE_TEXT")
    private String messageText;
    @Column (name = "LINKED_OBJECT_ID")
    private String linkedObjectId;
    @Column (name = "SEND_STATUS")
    private String sendStatus;
    @Column(name = "CTL_VALIDFROM")
    private LocalDateTime ctlValidfrom;
    @Column(name = "CREATED")
    private LocalDateTime created;
    @Column (name = "DELIVER_STATUS")
    private String deliverStatus;
    @Column (name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CTL_LOADING")
    private Long ctlLoading;
    @Column(name = "DB_LAST_UPD")
    private LocalDateTime dbLastUpd;
    @Column (name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column (name = "MODIFICATION_NUM")
    private BigDecimal modificationNum;
    @Id
    @Column (name = "ROW_ID")
    private String rowId;
    @Column (name = "OBJECT_TYPE")
    private String objectType;
    @Column (name = "DB_LAST_UPD_SRC")
    private String dbLastUpdSrc;
    @Column (name = "CTL_CSN")
    private BigDecimal ctlCsn;
    @Column(name = "INCR_PACK_RUN_ID")
    private Long incrPackRunId;
}
