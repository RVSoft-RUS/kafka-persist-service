package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxDeposit;


public interface CxDepositRepository extends CrudRepository<CxDeposit, String>, DeleteByCtlValidfromBefore {
}
