package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.stereotype.Repository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.model.CxTxbLogStat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CxTxbLogStatRepositoryImpl implements CxTxbLogStatRepository {
    @PersistenceContext//(unitName = "cxTxbLogStatPostgre")
    private EntityManager entityManager;

    @Override
    public void insert(CxTxbLogStat cxTxbLogStat) {
        entityManager.persist(cxTxbLogStat);
    }

    @Override
    public void update(CxTxbLogStat cxTxbLogStat) {
        entityManager.merge(cxTxbLogStat);
    }

    @Override
    public void delete(CxTxbLogStat cxTxbLogStat) {
        entityManager.createQuery("delete from raw_data_nrt.cx_txb_log_stat where row_id = :row_id")
                .setParameter("row_id", cxTxbLogStat.getRow_id())
                .executeUpdate();
    }
}
