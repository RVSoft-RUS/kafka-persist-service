package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import ru.sbrf.ckr.sberboard.kafkapersistservice.model.CxTxbLogStat;

/**
 * Интерфейс для работы с объектами CxTxbLogStat из базы
 *
 * @version 1.0
 * @author Смирнов Роман
 */
public interface CxTxbLogStatRepository {
    /**
     * Метод для добавления объекта CxTxbLogStat.
     *
     * @param cxTxbLogStat - object after
     *
     */
    void insert(CxTxbLogStat cxTxbLogStat);
    /**
     * Метод для обновления объекта CxTxbLogStat.
     *
     * @param cxTxbLogStat - object after
     */
    void update(CxTxbLogStat cxTxbLogStat);
    /**
     * Метод для удаления объекта CxTxbLogStat.
     *
     * @param cxTxbLogStat - object before
     */
    void delete(CxTxbLogStat cxTxbLogStat);
}
