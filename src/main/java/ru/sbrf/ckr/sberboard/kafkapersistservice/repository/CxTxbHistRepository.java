package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbHist;


public interface CxTxbHistRepository extends CrudRepository<CxTxbHist, String>, DeleteByCtlValidfromBefore {
}
