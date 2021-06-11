package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SParty;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SSrvReq;


public interface SPartyRepository extends CrudRepository<SParty, String>, DeleteByCtlValidfromBefore {
}
