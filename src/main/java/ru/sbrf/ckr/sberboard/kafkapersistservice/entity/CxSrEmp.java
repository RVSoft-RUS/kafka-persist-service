package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CX_SR_EMP", schema = "RAW_DATA_NRT")
public class CxSrEmp extends MessageObject {
    @Column(name = "EMP_ID")
    private String empId;
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;
    @Column(name = "ASGN_SYS_FLG")
    private String asgnSysFlg;
    @Column(name = "CTL_ACTION")
    private String ctlAction;
    @Column(name = "CONFLICT_ID")
    private String conflictId;
    @Column(name = "ASGN_CS_ACT_FLG")
    private String asgnCsActFlg;
    @Column(name = "LAST_UPD")
    private LocalDateTime lastUpd;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "ROLE_CD")
    private String roleCd;
    @Id
    @Column(name = "ROW_ID")
    private String rowId;
    @Column(name = "CTL_VALIDFROM")
    private LocalDateTime ctlValidfrom;
    @Column(name = "DB_LAST_UPD")
    private LocalDateTime dbLastUpd;
    @Column(name = "CREATED")
    private LocalDateTime created;
    @Column(name = "CTL_LOADING")
    private Long ctlLoading;
    @Column(name = "ASGN_DNRM_FLG")
    private String asgnDnrmFlg;
    @Column(name = "SR_ID")
    private String srId;
    @Column(name = "ASGN_MANL_FLG")
    private String asgnManlFlg;
    @Column(name = "MODIFICATION_NUM")
    private BigDecimal modificationNum;
    @Column(name = "CTL_CSN")
    private BigDecimal ctlCsn;
    @Column(name = "DB_LAST_UPD_SRC")
    private String dbLastUpdSrc;
    @Column(name = "INCR_PACK_RUN_ID")
    private Long incrPackRunId;
}
