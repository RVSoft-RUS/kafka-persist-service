package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxCommMsg;


public interface CxCommMsgRepository extends CrudRepository<CxCommMsg, String>, DeleteByCtlValidfromBefore {
}
