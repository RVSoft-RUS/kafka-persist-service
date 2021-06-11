package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cx_txb_call_jrn", schema = "raw_data_nrt", catalog = "staging")
public class CxTxbCallJrn {
    private String rowId;
    private String activity;
    private String callType;
    private String conflictId;
    private Timestamp created;
    private String createdBy;
    private String ctlAction;
    private BigDecimal ctlCsn;
    private Long ctlLoading;
    private Timestamp ctlValidfrom;
    private Timestamp dbLastUpd;
    private String dbLastUpdSrc;
    private Timestamp endDt;
    private String fioKm;
    private String gosbCode;
    private String gosbName;
    private Timestamp lastUpd;
    private String lastUpdBy;
    private String managerId;
    private BigDecimal modificationNum;
    private String organizationId;
    private String osbId;
    private String product;
    private String result;
    private String segment;
    private Timestamp startDt;
    private String tbCode;
    private String tbName;
    private String txbActionId;
    private String xComment;

    @Id
    @Column(name = "row_id", nullable = false, length = 4000)
    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    @Basic
    @Column(name = "activity", length = 4000)
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Basic
    @Column(name = "call_type", length = 4000)
    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    @Basic
    @Column(name = "conflict_id", length = 4000)
    public String getConflictId() {
        return conflictId;
    }

    public void setConflictId(String conflictId) {
        this.conflictId = conflictId;
    }

    @Basic
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "created_by", length = 4000)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "ctl_action", length = 4000)
    public String getCtlAction() {
        return ctlAction;
    }

    public void setCtlAction(String ctlAction) {
        this.ctlAction = ctlAction;
    }

    @Basic
    @Column(name = "ctl_csn")
    public BigDecimal getCtlCsn() {
        return ctlCsn;
    }

    public void setCtlCsn(BigDecimal ctlCsn) {
        this.ctlCsn = ctlCsn;
    }

    @Basic
    @Column(name = "ctl_loading")
    public Long getCtlLoading() {
        return ctlLoading;
    }

    public void setCtlLoading(Long ctlLoading) {
        this.ctlLoading = ctlLoading;
    }

    @Basic
    @Column(name = "ctl_validfrom")
    public Timestamp getCtlValidfrom() {
        return ctlValidfrom;
    }

    public void setCtlValidfrom(Timestamp ctlValidfrom) {
        this.ctlValidfrom = ctlValidfrom;
    }

    @Basic
    @Column(name = "db_last_upd")
    public Timestamp getDbLastUpd() {
        return dbLastUpd;
    }

    public void setDbLastUpd(Timestamp dbLastUpd) {
        this.dbLastUpd = dbLastUpd;
    }

    @Basic
    @Column(name = "db_last_upd_src", length = 4000)
    public String getDbLastUpdSrc() {
        return dbLastUpdSrc;
    }

    public void setDbLastUpdSrc(String dbLastUpdSrc) {
        this.dbLastUpdSrc = dbLastUpdSrc;
    }

    @Basic
    @Column(name = "end_dt")
    public Timestamp getEndDt() {
        return endDt;
    }

    public void setEndDt(Timestamp endDt) {
        this.endDt = endDt;
    }

    @Basic
    @Column(name = "fio_km", length = 4000)
    public String getFioKm() {
        return fioKm;
    }

    public void setFioKm(String fioKm) {
        this.fioKm = fioKm;
    }

    @Basic
    @Column(name = "gosb_code", length = 4000)
    public String getGosbCode() {
        return gosbCode;
    }

    public void setGosbCode(String gosbCode) {
        this.gosbCode = gosbCode;
    }

    @Basic
    @Column(name = "gosb_name", length = 4000)
    public String getGosbName() {
        return gosbName;
    }

    public void setGosbName(String gosbName) {
        this.gosbName = gosbName;
    }

    @Basic
    @Column(name = "last_upd")
    public Timestamp getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(Timestamp lastUpd) {
        this.lastUpd = lastUpd;
    }

    @Basic
    @Column(name = "last_upd_by", length = 4000)
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    @Basic
    @Column(name = "manager_id", length = 4000)
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "modification_num")
    public BigDecimal getModificationNum() {
        return modificationNum;
    }

    public void setModificationNum(BigDecimal modificationNum) {
        this.modificationNum = modificationNum;
    }

    @Basic
    @Column(name = "organization_id", length = 4000)
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "osb_id", length = 4000)
    public String getOsbId() {
        return osbId;
    }

    public void setOsbId(String osbId) {
        this.osbId = osbId;
    }

    @Basic
    @Column(name = "product", length = 4000)
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "result_", length = 4000)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "segment", length = 4000)
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    @Basic
    @Column(name = "start_dt")
    public Timestamp getStartDt() {
        return startDt;
    }

    public void setStartDt(Timestamp startDt) {
        this.startDt = startDt;
    }

    @Basic
    @Column(name = "tb_code", length = 4000)
    public String getTbCode() {
        return tbCode;
    }

    public void setTbCode(String tbCode) {
        this.tbCode = tbCode;
    }

    @Basic
    @Column(name = "tb_name", length = 4000)
    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    @Basic
    @Column(name = "txb_action_id", length = 4000)
    public String getTxbActionId() {
        return txbActionId;
    }

    public void setTxbActionId(String txbActionId) {
        this.txbActionId = txbActionId;
    }

    @Basic
    @Column(name = "x_comment", length = 4000)
    public String getxComment() {
        return xComment;
    }

    public void setxComment(String xComment) {
        this.xComment = xComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CxTxbCallJrn that = (CxTxbCallJrn) o;
        return Objects.equals(rowId, that.rowId) && Objects.equals(activity, that.activity) && Objects.equals(callType, that.callType) && Objects.equals(conflictId, that.conflictId) && Objects.equals(created, that.created) && Objects.equals(createdBy, that.createdBy) && Objects.equals(ctlAction, that.ctlAction) && Objects.equals(ctlCsn, that.ctlCsn) && Objects.equals(ctlLoading, that.ctlLoading) && Objects.equals(ctlValidfrom, that.ctlValidfrom) && Objects.equals(dbLastUpd, that.dbLastUpd) && Objects.equals(dbLastUpdSrc, that.dbLastUpdSrc) && Objects.equals(endDt, that.endDt) && Objects.equals(fioKm, that.fioKm) && Objects.equals(gosbCode, that.gosbCode) && Objects.equals(gosbName, that.gosbName) && Objects.equals(lastUpd, that.lastUpd) && Objects.equals(lastUpdBy, that.lastUpdBy) && Objects.equals(managerId, that.managerId) && Objects.equals(modificationNum, that.modificationNum) && Objects.equals(organizationId, that.organizationId) && Objects.equals(osbId, that.osbId) && Objects.equals(product, that.product) && Objects.equals(result, that.result) && Objects.equals(segment, that.segment) && Objects.equals(startDt, that.startDt) && Objects.equals(tbCode, that.tbCode) && Objects.equals(tbName, that.tbName) && Objects.equals(txbActionId, that.txbActionId) && Objects.equals(xComment, that.xComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowId, activity, callType, conflictId, created, createdBy, ctlAction, ctlCsn, ctlLoading, ctlValidfrom, dbLastUpd, dbLastUpdSrc, endDt, fioKm, gosbCode, gosbName, lastUpd, lastUpdBy, managerId, modificationNum, organizationId, osbId, product, result, segment, startDt, tbCode, tbName, txbActionId, xComment);
    }
}
