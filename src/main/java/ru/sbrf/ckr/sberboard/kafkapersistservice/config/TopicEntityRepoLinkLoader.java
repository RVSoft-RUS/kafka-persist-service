package ru.sbrf.ckr.sberboard.kafkapersistservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.*;
import ru.sbrf.ckr.sberboard.kafkapersistservice.model.TopicEntityRepoLink;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.*;

@Configuration
public class TopicEntityRepoLinkLoader {
    @Bean
    TopicEntityRepoLink getTopicEntityRepoLink(CxTxbEvtRepository cxTxbEvtRepository,
                                               CxTxbHistRepository cxTxbHistRepository,
                                               CxTxbLogStatRepository cxTxbLogStatRepository,
                                               CxDepositRepository cxDepositRepository,
                                               SSrvReqXRepository sSrvReqXRepository,
                                               CxCommMsgRepository cxCommMsgRepository,
                                               CxSrConclRepository cxSrConclRepository,
                                               CxSrEmpRepository cxSrEmpRepository,
                                               CxSrExpertiseRepository cxSrExpertiseRepository,
                                               SSrvReqRepository sSrvReqRepository,
                                               CxTxbCallJrnRepository cxTxbCallJrnRepository,
                                               CxTxbListLvlRepository cxTxbListLvlRepository,
                                               CxTxbScheduleRepository cxTxbScheduleRepository,
                                               CxTxbSmenyRepository cxTxbSmenyRepository
    ) {
        TopicEntityRepoLink topicEntityRepoLink = new TopicEntityRepoLink();
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_EVT", CxTxbEvt.class, cxTxbEvtRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_HIST", CxTxbHist.class, cxTxbHistRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LOG_STAT", CxTxbLogStat.class, cxTxbLogStatRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_DEPOSIT", CxDeposit.class, cxDepositRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_S_SRV_REQ_X", SSrvReqX.class, sSrvReqXRepository);

        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_COMM_MSG", CxCommMsg.class, cxCommMsgRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_SR_CONCL", CxSrConcl.class, cxSrConclRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_SR_EMP", CxSrEmp.class, cxSrEmpRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_SR_EXPERTISE", CxSrExpertise.class, cxSrExpertiseRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_S_SRV_REQ", SSrvReq.class, sSrvReqRepository);

        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_CALL_JRN", CxTxbCallJrn.class, cxTxbCallJrnRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LIST_LVL", CxTxbListLvl.class, cxTxbListLvlRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_SCHEDULE", CxTxbSchedule.class, cxTxbScheduleRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_SMENY", CxTxbSmeny.class, cxTxbSmenyRepository);

        return topicEntityRepoLink;
    }
}
