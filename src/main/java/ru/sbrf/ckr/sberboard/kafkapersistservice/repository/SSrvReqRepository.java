package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SSrvReq;


public interface SSrvReqRepository extends CrudRepository<SSrvReq, String>, DeleteByCtlValidfromBefore {
}
