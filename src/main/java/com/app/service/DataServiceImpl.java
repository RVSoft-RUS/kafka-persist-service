package com.app.service;

import com.app.model.CxTxbLogStat;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    @Override
    public void saveMessage(CxTxbLogStat cxTxbLogStat) {
        System.out.println("Save object:");
        System.out.println(cxTxbLogStat.getAction_id());
        System.out.println(cxTxbLogStat.getChange_dt());
        System.out.println(cxTxbLogStat.getConflict_id());
        System.out.println(cxTxbLogStat.getCreated());
        System.out.println(cxTxbLogStat.getCreated_by());
        System.out.println(cxTxbLogStat.getCurr_status());
    }
}
