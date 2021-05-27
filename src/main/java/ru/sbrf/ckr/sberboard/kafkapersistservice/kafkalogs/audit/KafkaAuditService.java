package ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.MessageObject;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.abstractkafka.KafkaEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.abstractkafka.KafkaSenderService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.service.OperationType;

@Service
public class KafkaAuditService extends KafkaSenderService {

    protected KafkaEvent getEvent(String message, String subTypeId, String modeId) {
        return getEvent("Audit", message, subTypeId, modeId);
    }

    @Transactional(value = "kafkaTransactionManager")
    public void sendOperationMessage(SberDataCloudFormattedMessage formattedMessage) {
        String operation = OperationType.valueOf(formattedMessage.getOp_type()).getDescription();
        send(operation + " object: "
                + " table: " + formattedMessage.getTable()
                + " op_type: " + formattedMessage.getOp_type()
                + " op_ts: " + formattedMessage.getOp_ts()
                + " current_ts: " + formattedMessage.getCurrent_ts()
                + " pos: " + formattedMessage.getPos(), SubTypeIdAuditEvent.C0.name());

    }

    @Transactional(value = "kafkaTransactionManager")
    public void sendExtraFields(SberDataCloudFormattedMessage formattedMessage, MessageObject messageObject) {
        send("Object has unknown fields: " + messageObject.getUnknownFields().toString() + " table: " + formattedMessage.getTable()
                + " op_type: " + formattedMessage.getOp_type()
                + " op_ts: " + formattedMessage.getOp_ts()
                + " current_ts: " + formattedMessage.getCurrent_ts()
                + " pos: " + formattedMessage.getPos(), SubTypeIdAuditEvent.F0.name());
    }

    @Transactional(value = "kafkaTransactionManager")
    public void sendError(SberDataCloudFormattedMessage formattedMessage, Exception e) {
        String operation = OperationType.valueOf(formattedMessage.getOp_type()).getDescription();
        send("ERROR when trying to " + operation + " object: " + e.getMessage() + " table: " + formattedMessage.getTable()
                + " op_type:" + formattedMessage.getOp_type()
                + " current_ts: " + formattedMessage.getCurrent_ts()
                + " op_ts: " + formattedMessage.getOp_ts()
                + " pos: " + formattedMessage.getPos(), SubTypeIdAuditEvent.F0.name());
    }

}
