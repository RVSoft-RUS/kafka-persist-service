package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cx_txb_schedule", schema = "raw_data_nrt", catalog = "staging")
public class CxTxbSchedule {

    @Id
    private String rowId;
    private BigDecimal shiftStart;
    private String shiftName;
    private BigDecimal shiftEnd;
    private LocalDateTime shiftDate;
    private String parRowId;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private LocalDateTime lastUpd;
    private String dbLastUpdSrc;
    private LocalDateTime dbLastUpd;
    private String createdBy;
    private LocalDateTime created;
    private String conflictId;
    private BigDecimal breakStart;
    private BigDecimal breakEnd;
    private BigDecimal break2Start;
    private BigDecimal break2End;
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
    @Column(name = "shift_start")
    public BigDecimal getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(BigDecimal shiftStart) {
        this.shiftStart = shiftStart;
    }

    @Basic
    @Column(name = "shift_name", length = 4000)
    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    @Basic
    @Column(name = "shift_end")
    public BigDecimal getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(BigDecimal shiftEnd) {
        this.shiftEnd = shiftEnd;
    }

    @Basic
    @Column(name = "shift_date")
    public LocalDateTime getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(LocalDateTime shiftDate) {
        this.shiftDate = shiftDate;
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
    @Column(name = "break_start")
    public BigDecimal getBreakStart() {
        return breakStart;
    }

    public void setBreakStart(BigDecimal breakStart) {
        this.breakStart = breakStart;
    }

    @Basic
    @Column(name = "break_end")
    public BigDecimal getBreakEnd() {
        return breakEnd;
    }

    public void setBreakEnd(BigDecimal breakEnd) {
        this.breakEnd = breakEnd;
    }

    @Basic
    @Column(name = "break2_start")
    public BigDecimal getBreak2Start() {
        return break2Start;
    }

    public void setBreak2Start(BigDecimal break2Start) {
        this.break2Start = break2Start;
    }

    @Basic
    @Column(name = "break2_end")
    public BigDecimal getBreak2End() {
        return break2End;
    }

    public void setBreak2End(BigDecimal break2End) {
        this.break2End = break2End;
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
        CxTxbSchedule that = (CxTxbSchedule) o;
        return Objects.equals(rowId, that.rowId) && Objects.equals(shiftStart, that.shiftStart) && Objects.equals(shiftName, that.shiftName) && Objects.equals(shiftEnd, that.shiftEnd) && Objects.equals(shiftDate, that.shiftDate) && Objects.equals(parRowId, that.parRowId) && Objects.equals(modificationNum, that.modificationNum) && Objects.equals(lastUpdBy, that.lastUpdBy) && Objects.equals(lastUpd, that.lastUpd) && Objects.equals(dbLastUpdSrc, that.dbLastUpdSrc) && Objects.equals(dbLastUpd, that.dbLastUpd) && Objects.equals(createdBy, that.createdBy) && Objects.equals(created, that.created) && Objects.equals(conflictId, that.conflictId) && Objects.equals(breakStart, that.breakStart) && Objects.equals(breakEnd, that.breakEnd) && Objects.equals(break2Start, that.break2Start) && Objects.equals(break2End, that.break2End) && Objects.equals(ctlValidfrom, that.ctlValidfrom) && Objects.equals(ctlAction, that.ctlAction) && Objects.equals(ctlLoading, that.ctlLoading) && Objects.equals(ctlCsn, that.ctlCsn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shiftStart, shiftName, shiftEnd, shiftDate, rowId, parRowId, modificationNum, lastUpdBy, lastUpd, dbLastUpdSrc, dbLastUpd, createdBy, created, conflictId, breakStart, breakEnd, break2Start, break2End, ctlAction, ctlCsn, ctlLoading, ctlValidfrom);
    }
}
