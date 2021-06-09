package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxSrExpertise;


public interface CxSrExpertiseRepository extends CrudRepository<CxSrExpertise, String>, DeleteByCtlValidfromBefore {
}
