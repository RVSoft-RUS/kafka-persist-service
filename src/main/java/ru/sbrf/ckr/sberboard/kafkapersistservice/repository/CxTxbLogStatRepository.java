package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbLogStat;

/**
 * Интерфейс для работы с объектами CxTxbLogStat из базы
 *
 * @author Смирнов Роман
 * @version 1.0
 */
@Repository
public interface CxTxbLogStatRepository extends CrudRepository<CxTxbLogStat, String>, DeleteByCtlValidfromBefore {
    //    /**
//     * Метод для добавления объекта CxTxbLogStat.
//     *
//     * @param cxTxbLogStat - object after
//     *
//     */
//    void insert(CxTxbLogStat cxTxbLogStat);
//    /**
//     * Метод для обновления объекта CxTxbLogStat.
//     *
//     * @param cxTxbLogStat - object after
//     */
//    void update(CxTxbLogStat cxTxbLogStat);
//    /**
//     * Метод для удаления объекта CxTxbLogStat.
//     *
//     * @param cxTxbLogStat - object before
//     */
//    void delete(CxTxbLogStat cxTxbLogStat);
}
