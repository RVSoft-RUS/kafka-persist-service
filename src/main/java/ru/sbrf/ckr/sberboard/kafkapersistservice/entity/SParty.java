package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "s_party", schema = "raw_data_nrt", catalog = "staging")
public class SParty {
    private String xHeadFlg;
    private String xForLink;
    private String rowId;
    private String rootPartyFlg;
    private String parPartyId;
    private String partyUid;
    private String partyTypeCd;
    private String name;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String groupTypeCd;
    private String edEnabledFlg;
    private String edDeletedFlg;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private String adminAdjFlg;
    private Long ctlLoading;
    private LocalDateTime ctlValidfrom;
    private BigDecimal ctlCsn;
    private String ctlAction;

    @Basic
    @Column(name = "x_head_flg", length = 4000)
    public String getxHeadFlg() {
        return xHeadFlg;
    }

    public void setxHeadFlg(String xHeadFlg) {
        this.xHeadFlg = xHeadFlg;
    }

    @Basic
    @Column(name = "x_for_link", length = 4000)
    public String getxForLink() {
        return xForLink;
    }

    public void setxForLink(String xForLink) {
        this.xForLink = xForLink;
    }

    @Id
    @Column(name = "row_id", nullable = false, length = 4000)
    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    @Basic
    @Column(name = "root_party_flg", length = 4000)
    public String getRootPartyFlg() {
        return rootPartyFlg;
    }

    public void setRootPartyFlg(String rootPartyFlg) {
        this.rootPartyFlg = rootPartyFlg;
    }

    @Basic
    @Column(name = "par_party_id", length = 4000)
    public String getParPartyId() {
        return parPartyId;
    }

    public void setParPartyId(String parPartyId) {
        this.parPartyId = parPartyId;
    }

    @Basic
    @Column(name = "party_uid", length = 4000)
    public String getPartyUid() {
        return partyUid;
    }

    public void setPartyUid(String partyUid) {
        this.partyUid = partyUid;
    }

    @Basic
    @Column(name = "party_type_cd", length = 4000)
    public String getPartyTypeCd() {
        return partyTypeCd;
    }

    public void setPartyTypeCd(String partyTypeCd) {
        this.partyTypeCd = partyTypeCd;
    }

    @Basic
    @Column(name = "name", length = 4000)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "group_type_cd", length = 4000)
    public String getGroupTypeCd() {
        return groupTypeCd;
    }

    public void setGroupTypeCd(String groupTypeCd) {
        this.groupTypeCd = groupTypeCd;
    }

    @Basic
    @Column(name = "ed_enabled_flg", length = 4000)
    public String getEdEnabledFlg() {
        return edEnabledFlg;
    }

    public void setEdEnabledFlg(String edEnabledFlg) {
        this.edEnabledFlg = edEnabledFlg;
    }

    @Basic
    @Column(name = "ed_deleted_flg", length = 4000)
    public String getEdDeletedFlg() {
        return edDeletedFlg;
    }

    public void setEdDeletedFlg(String edDeletedFlg) {
        this.edDeletedFlg = edDeletedFlg;
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
    @Column(name = "admin_adj_flg", length = 4000)
    public String getAdminAdjFlg() {
        return adminAdjFlg;
    }

    public void setAdminAdjFlg(String adminAdjFlg) {
        this.adminAdjFlg = adminAdjFlg;
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
    public LocalDateTime getCtlValidfrom() {
        return ctlValidfrom;
    }

    public void setCtlValidfrom(LocalDateTime ctlValidfrom) {
        this.ctlValidfrom = ctlValidfrom;
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
    @Column(name = "ctl_action", length = 4000)
    public String getCtlAction() {
        return ctlAction;
    }

    public void setCtlAction(String ctlAction) {
        this.ctlAction = ctlAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SParty sParty = (SParty) o;
        return Objects.equals(xHeadFlg, sParty.xHeadFlg) && Objects.equals(xForLink, sParty.xForLink) && Objects.equals(rowId, sParty.rowId) && Objects.equals(rootPartyFlg, sParty.rootPartyFlg) && Objects.equals(parPartyId, sParty.parPartyId) && Objects.equals(partyUid, sParty.partyUid) && Objects.equals(partyTypeCd, sParty.partyTypeCd) && Objects.equals(name, sParty.name) && Objects.equals(modificationNum, sParty.modificationNum) && Objects.equals(lastUpdBy, sParty.lastUpdBy) && Objects.equals(lastUpd, sParty.lastUpd) && Objects.equals(groupTypeCd, sParty.groupTypeCd) && Objects.equals(edEnabledFlg, sParty.edEnabledFlg) && Objects.equals(edDeletedFlg, sParty.edDeletedFlg) && Objects.equals(dbLastUpdSrc, sParty.dbLastUpdSrc) && Objects.equals(dbLastUpd, sParty.dbLastUpd) && Objects.equals(createdBy, sParty.createdBy) && Objects.equals(created, sParty.created) && Objects.equals(conflictId, sParty.conflictId) && Objects.equals(adminAdjFlg, sParty.adminAdjFlg) && Objects.equals(ctlLoading, sParty.ctlLoading) && Objects.equals(ctlValidfrom, sParty.ctlValidfrom) && Objects.equals(ctlCsn, sParty.ctlCsn) && Objects.equals(ctlAction, sParty.ctlAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xHeadFlg, xForLink, rowId, rootPartyFlg, parPartyId, partyUid, partyTypeCd, name, modificationNum, lastUpdBy, lastUpd, groupTypeCd, edEnabledFlg, edDeletedFlg, dbLastUpdSrc, dbLastUpd, createdBy, created, conflictId, adminAdjFlg, ctlLoading, ctlValidfrom, ctlCsn, ctlAction);
    }
}
