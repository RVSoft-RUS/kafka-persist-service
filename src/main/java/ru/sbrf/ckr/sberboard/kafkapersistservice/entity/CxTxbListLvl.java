package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cx_txb_list_lvl", schema = "raw_data_nrt", catalog = "staging")
public class CxTxbListLvl {

    @Id
    private String rowId;
    private String xTemplateType;
    private BigDecimal xSlaMinClear;
    private BigDecimal xSlaMin;
    private String xSignTempl;
    private String xReqSign;
    private String xReqScan;
    private String xReqDoc;
    private String xPsfSbbolCode;
    private String xPriority;
    private String xParseEmailFlg;
    private BigDecimal xLevel;
    private String xKicCollection;
    private String xKicCashbox;
    private String xDirection;
    private String xDir;
    private String xDesc;
    private String xCodeType;
    private String xCode;
    private String xActiveFlg;
    private String visibilityKm;
    private String value;
    private String srProductName;
    private String prDirectionId;
    private String parRowId;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private String ccProductName;
    private LocalDateTime ctlValidfrom;
    private String ctlAction;
    private Long ctlLoading;
    private BigDecimal ctlCsn;

    @Id
    @Column(name = "row_id", nullable = false, length = 4000)
    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    @Basic
    @Column(name = "x_template_type", length = 4000)
    public String getxTemplateType() {
        return xTemplateType;
    }

    public void setxTemplateType(String xTemplateType) {
        this.xTemplateType = xTemplateType;
    }

    @Basic
    @Column(name = "x_sla_min_clear")
    public BigDecimal getxSlaMinClear() {
        return xSlaMinClear;
    }

    public void setxSlaMinClear(BigDecimal xSlaMinClear) {
        this.xSlaMinClear = xSlaMinClear;
    }

    @Basic
    @Column(name = "x_sla_min")
    public BigDecimal getxSlaMin() {
        return xSlaMin;
    }

    public void setxSlaMin(BigDecimal xSlaMin) {
        this.xSlaMin = xSlaMin;
    }

    @Basic
    @Column(name = "x_sign_templ", length = 4000)
    public String getxSignTempl() {
        return xSignTempl;
    }

    public void setxSignTempl(String xSignTempl) {
        this.xSignTempl = xSignTempl;
    }

    @Basic
    @Column(name = "x_req_sign", length = 4000)
    public String getxReqSign() {
        return xReqSign;
    }

    public void setxReqSign(String xReqSign) {
        this.xReqSign = xReqSign;
    }

    @Basic
    @Column(name = "x_req_scan", length = 4000)
    public String getxReqScan() {
        return xReqScan;
    }

    public void setxReqScan(String xReqScan) {
        this.xReqScan = xReqScan;
    }

    @Basic
    @Column(name = "x_req_doc", length = 4000)
    public String getxReqDoc() {
        return xReqDoc;
    }

    public void setxReqDoc(String xReqDoc) {
        this.xReqDoc = xReqDoc;
    }

    @Basic
    @Column(name = "x_psf_sbbol_code", length = 4000)
    public String getxPsfSbbolCode() {
        return xPsfSbbolCode;
    }

    public void setxPsfSbbolCode(String xPsfSbbolCode) {
        this.xPsfSbbolCode = xPsfSbbolCode;
    }

    @Basic
    @Column(name = "x_priority", length = 4000)
    public String getxPriority() {
        return xPriority;
    }

    public void setxPriority(String xPriority) {
        this.xPriority = xPriority;
    }

    @Basic
    @Column(name = "x_parse_email_flg", length = 4000)
    public String getxParseEmailFlg() {
        return xParseEmailFlg;
    }

    public void setxParseEmailFlg(String xParseEmailFlg) {
        this.xParseEmailFlg = xParseEmailFlg;
    }

    @Basic
    @Column(name = "x_level")
    public BigDecimal getxLevel() {
        return xLevel;
    }

    public void setxLevel(BigDecimal xLevel) {
        this.xLevel = xLevel;
    }

    @Basic
    @Column(name = "x_kic_collection", length = 4000)
    public String getxKicCollection() {
        return xKicCollection;
    }

    public void setxKicCollection(String xKicCollection) {
        this.xKicCollection = xKicCollection;
    }

    @Basic
    @Column(name = "x_kic_cashbox", length = 4000)
    public String getxKicCashbox() {
        return xKicCashbox;
    }

    public void setxKicCashbox(String xKicCashbox) {
        this.xKicCashbox = xKicCashbox;
    }

    @Basic
    @Column(name = "x_direction", length = 4000)
    public String getxDirection() {
        return xDirection;
    }

    public void setxDirection(String xDirection) {
        this.xDirection = xDirection;
    }

    @Basic
    @Column(name = "x_dir", length = 4000)
    public String getxDir() {
        return xDir;
    }

    public void setxDir(String xDir) {
        this.xDir = xDir;
    }

    @Basic
    @Column(name = "x_desc", length = 4000)
    public String getxDesc() {
        return xDesc;
    }

    public void setxDesc(String xDesc) {
        this.xDesc = xDesc;
    }

    @Basic
    @Column(name = "x_code_type", length = 4000)
    public String getxCodeType() {
        return xCodeType;
    }

    public void setxCodeType(String xCodeType) {
        this.xCodeType = xCodeType;
    }

    @Basic
    @Column(name = "x_code", length = 4000)
    public String getxCode() {
        return xCode;
    }

    public void setxCode(String xCode) {
        this.xCode = xCode;
    }

    @Basic
    @Column(name = "x_active_flg", length = 4000)
    public String getxActiveFlg() {
        return xActiveFlg;
    }

    public void setxActiveFlg(String xActiveFlg) {
        this.xActiveFlg = xActiveFlg;
    }

    @Basic
    @Column(name = "visibility_km", length = 4000)
    public String getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    @Basic
    @Column(name = "value_", length = 4000)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "sr_product_name", length = 4000)
    public String getSrProductName() {
        return srProductName;
    }

    public void setSrProductName(String srProductName) {
        this.srProductName = srProductName;
    }

    @Basic
    @Column(name = "pr_direction_id", length = 4000)
    public String getPrDirectionId() {
        return prDirectionId;
    }

    public void setPrDirectionId(String prDirectionId) {
        this.prDirectionId = prDirectionId;
    }

    @Basic
    @Column(name = "par_row_id", length = 4000)
    public String getParRowId() {
        return parRowId;
    }

    public void setParRowId(String parRowId) {
        this.parRowId = parRowId;
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
    @Column(name = "last_upd_by", length = 4000)
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    @Basic
    @Column(name = "last_upd")
    public LocalDateTime getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(LocalDateTime lastUpd) {
        this.lastUpd = lastUpd;
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
    @Column(name = "db_last_upd")
    public LocalDateTime getDbLastUpd() {
        return dbLastUpd;
    }

    public void setDbLastUpd(LocalDateTime dbLastUpd) {
        this.dbLastUpd = dbLastUpd;
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
    @Column(name = "created")
    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
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
    @Column(name = "cc_product_name", length = 4000)
    public String getCcProductName() {
        return ccProductName;
    }

    public void setCcProductName(String ccProductName) {
        this.ccProductName = ccProductName;
    }

    @Basic
    @Column(name = "ctl_validfrom")
    public LocalDateTime getCtlValidfrom() {
        return ctlValidfrom;
    }

    public void setCtlValidfrom(LocalDateTime ctlValidfrom) {
        this.ctlValidfrom = ctlValidfrom;
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
    @Column(name = "ctl_loading")
    public Long getCtlLoading() {
        return ctlLoading;
    }

    public void setCtlLoading(Long ctlLoading) {
        this.ctlLoading = ctlLoading;
    }

    @Basic
    @Column(name = "ctl_csn")
    public BigDecimal getCtlCsn() {
        return ctlCsn;
    }

    public void setCtlCsn(BigDecimal ctlCsn) {
        this.ctlCsn = ctlCsn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CxTxbListLvl that = (CxTxbListLvl) o;
        return Objects.equals(rowId, that.rowId) && Objects.equals(xTemplateType, that.xTemplateType) && Objects.equals(xSlaMinClear, that.xSlaMinClear) && Objects.equals(xSlaMin, that.xSlaMin) && Objects.equals(xSignTempl, that.xSignTempl) && Objects.equals(xReqSign, that.xReqSign) && Objects.equals(xReqScan, that.xReqScan) && Objects.equals(xReqDoc, that.xReqDoc) && Objects.equals(xPsfSbbolCode, that.xPsfSbbolCode) && Objects.equals(xPriority, that.xPriority) && Objects.equals(xParseEmailFlg, that.xParseEmailFlg) && Objects.equals(xLevel, that.xLevel) && Objects.equals(xKicCollection, that.xKicCollection) && Objects.equals(xKicCashbox, that.xKicCashbox) && Objects.equals(xDirection, that.xDirection) && Objects.equals(xDir, that.xDir) && Objects.equals(xDesc, that.xDesc) && Objects.equals(xCodeType, that.xCodeType) && Objects.equals(xCode, that.xCode) && Objects.equals(xActiveFlg, that.xActiveFlg) && Objects.equals(visibilityKm, that.visibilityKm) && Objects.equals(value, that.value) && Objects.equals(srProductName, that.srProductName) && Objects.equals(prDirectionId, that.prDirectionId) && Objects.equals(parRowId, that.parRowId) && Objects.equals(modificationNum, that.modificationNum) && Objects.equals(lastUpdBy, that.lastUpdBy) && Objects.equals(lastUpd, that.lastUpd) && Objects.equals(dbLastUpdSrc, that.dbLastUpdSrc) && Objects.equals(dbLastUpd, that.dbLastUpd) && Objects.equals(createdBy, that.createdBy) && Objects.equals(created, that.created) && Objects.equals(conflictId, that.conflictId) && Objects.equals(ccProductName, that.ccProductName) && Objects.equals(ctlValidfrom, that.ctlValidfrom) && Objects.equals(ctlAction, that.ctlAction) && Objects.equals(ctlLoading, that.ctlLoading) && Objects.equals(ctlCsn, that.ctlCsn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xTemplateType, xSlaMinClear, xSlaMin, xSignTempl, xReqSign, xReqScan, xReqDoc, xPsfSbbolCode, xPriority, xParseEmailFlg, xLevel, xKicCollection, xKicCashbox, xDirection, xDir, xDesc, xCodeType, xCode, xActiveFlg, visibilityKm, value, srProductName, rowId, prDirectionId, parRowId, modificationNum, lastUpdBy, lastUpd, dbLastUpdSrc, dbLastUpd, createdBy, created, conflictId, ccProductName, ctlAction, ctlValidfrom, ctlLoading, ctlCsn);
    }
}
