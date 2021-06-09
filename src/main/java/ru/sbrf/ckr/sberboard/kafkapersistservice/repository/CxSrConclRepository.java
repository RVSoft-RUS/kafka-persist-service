package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxSrConcl;


public interface CxSrConclRepository extends CrudRepository<CxSrConcl, String>, DeleteByCtlValidfromBefore {
}
