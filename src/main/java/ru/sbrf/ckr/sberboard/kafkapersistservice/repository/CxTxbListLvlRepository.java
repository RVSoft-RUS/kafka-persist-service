package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbListLvl;

public interface CxTxbListLvlRepository extends CrudRepository<CxTxbListLvl, String>, DeleteByCtlValidfromBefore {
}
