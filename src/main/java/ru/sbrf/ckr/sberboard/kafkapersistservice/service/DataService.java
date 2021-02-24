package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import ru.sbrf.ckr.sberboard.kafkapersistservice.model.CxTxbLogStat;

public interface DataService {
    void saveMessage(CxTxbLogStat cx_txb_log_stat);
}
