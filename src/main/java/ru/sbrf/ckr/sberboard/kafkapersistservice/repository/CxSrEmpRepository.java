package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxSrEmp;


public interface CxSrEmpRepository extends CrudRepository<CxSrEmp, String>, DeleteByCtlValidfromBefore {
}
