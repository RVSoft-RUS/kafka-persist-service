package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Table(name = "cx_txb_smeny", schema = "raw_data_nrt", catalog = "staging")
public class CxTxbSmeny {
    private Timestamp xIAmFreeTime;
    private String xIAmFree;
    private Timestamp xFreezeEnd;
    private BigDecimal wedTo;
    private BigDecimal wedFrom;
    private String wedAct;
    private BigDecimal tueTo;
    private BigDecimal tueFrom;
    private String tueAct;
    private BigDecimal thurTo;
    private BigDecimal thurFrom;
    private String thurAct;
    private BigDecimal taskTime;
    private BigDecimal taskNum;
    private BigDecimal sunTo;
    private BigDecimal sunFrom;
    private String sunAct;
    private Timestamp startWorkNextDt;
    private Timestamp startWorkDt;
    private Timestamp startBreakDt;
    private Timestamp startBreak2Dt;
    private BigDecimal satTo;
    private BigDecimal satFrom;
    private String satAct;
    private String rowId;
    private String prDirectionId;
    private BigDecimal monTo;
    private BigDecimal monFrom;
    private String monAct;
    private BigDecimal modificationNum;
    private String lastUpdBy;
    private Timestamp lastUpd;
    private BigDecimal friTo;
    private BigDecimal friFrom;
    private String friAct;
    private Timestamp endWorkDt;
    private Timestamp endBreakDt;
    private Timestamp endBreak2Dt;
    private String empId;
    private String dbLastUpdSrc;
    private Timestamp dbLastUpd;
    private String createdBy;
    private Timestamp created;
    private String conflictId;
    private String ctlAction;
    private Timestamp ctlValidfrom;
    private Long ctlLoading;
    private BigDecimal ctlCsn;

    @Basic
    @Column(name = "x_i_am_free_time")
    public Timestamp getxIAmFreeTime() {
        return xIAmFreeTime;
    }

    public void setxIAmFreeTime(Timestamp xIAmFreeTime) {
        this.xIAmFreeTime = xIAmFreeTime;
    }

    @Basic
    @Column(name = "x_i_am_free", length = 4000)
    public String getxIAmFree() {
        return xIAmFree;
    }

    public void setxIAmFree(String xIAmFree) {
        this.xIAmFree = xIAmFree;
    }

    @Basic
    @Column(name = "x_freeze_end")
    public Timestamp getxFreezeEnd() {
        return xFreezeEnd;
    }

    public void setxFreezeEnd(Timestamp xFreezeEnd) {
        this.xFreezeEnd = xFreezeEnd;
    }

    @Basic
    @Column(name = "wed_to")
    public BigDecimal getWedTo() {
        return wedTo;
    }

    public void setWedTo(BigDecimal wedTo) {
        this.wedTo = wedTo;
    }

    @Basic
    @Column(name = "wed_from")
    public BigDecimal getWedFrom() {
        return wedFrom;
    }

    public void setWedFrom(BigDecimal wedFrom) {
        this.wedFrom = wedFrom;
    }

    @Basic
    @Column(name = "wed_act", length = 4000)
    public String getWedAct() {
        return wedAct;
    }

    public void setWedAct(String wedAct) {
        this.wedAct = wedAct;
    }

    @Basic
    @Column(name = "tue_to")
    public BigDecimal getTueTo() {
        return tueTo;
    }

    public void setTueTo(BigDecimal tueTo) {
        this.tueTo = tueTo;
    }

    @Basic
    @Column(name = "tue_from")
    public BigDecimal getTueFrom() {
        return tueFrom;
    }

    public void setTueFrom(BigDecimal tueFrom) {
        this.tueFrom = tueFrom;
    }

    @Basic
    @Column(name = "tue_act", length = 4000)
    public String getTueAct() {
        return tueAct;
    }

    public void setTueAct(String tueAct) {
        this.tueAct = tueAct;
    }

    @Basic
    @Column(name = "thur_to")
    public BigDecimal getThurTo() {
        return thurTo;
    }

    public void setThurTo(BigDecimal thurTo) {
        this.thurTo = thurTo;
    }

    @Basic
    @Column(name = "thur_from")
    public BigDecimal getThurFrom() {
        return thurFrom;
    }

    public void setThurFrom(BigDecimal thurFrom) {
        this.thurFrom = thurFrom;
    }

    @Basic
    @Column(name = "thur_act", length = 4000)
    public String getThurAct() {
        return thurAct;
    }

    public void setThurAct(String thurAct) {
        this.thurAct = thurAct;
    }

    @Basic
    @Column(name = "task_time")
    public BigDecimal getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(BigDecimal taskTime) {
        this.taskTime = taskTime;
    }

    @Basic
    @Column(name = "task_num")
    public BigDecimal getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(BigDecimal taskNum) {
        this.taskNum = taskNum;
    }

    @Basic
    @Column(name = "sun_to")
    public BigDecimal getSunTo() {
        return sunTo;
    }

    public void setSunTo(BigDecimal sunTo) {
        this.sunTo = sunTo;
    }

    @Basic
    @Column(name = "sun_from")
    public BigDecimal getSunFrom() {
        return sunFrom;
    }

    public void setSunFrom(BigDecimal sunFrom) {
        this.sunFrom = sunFrom;
    }

    @Basic
    @Column(name = "sun_act", length = 4000)
    public String getSunAct() {
        return sunAct;
    }

    public void setSunAct(String sunAct) {
        this.sunAct = sunAct;
    }

    @Basic
    @Column(name = "start_work_next_dt")
    public Timestamp getStartWorkNextDt() {
        return startWorkNextDt;
    }

    public void setStartWorkNextDt(Timestamp startWorkNextDt) {
        this.startWorkNextDt = startWorkNextDt;
    }

    @Basic
    @Column(name = "start_work_dt")
    public Timestamp getStartWorkDt() {
        return startWorkDt;
    }

    public void setStartWorkDt(Timestamp startWorkDt) {
        this.startWorkDt = startWorkDt;
    }

    @Basic
    @Column(name = "start_break_dt")
    public Timestamp getStartBreakDt() {
        return startBreakDt;
    }

    public void setStartBreakDt(Timestamp startBreakDt) {
        this.startBreakDt = startBreakDt;
    }

    @Basic
    @Column(name = "start_break2_dt")
    public Timestamp getStartBreak2Dt() {
        return startBreak2Dt;
    }

    public void setStartBreak2Dt(Timestamp startBreak2Dt) {
        this.startBreak2Dt = startBreak2Dt;
    }

    @Basic
    @Column(name = "sat_to")
    public BigDecimal getSatTo() {
        return satTo;
    }

    public void setSatTo(BigDecimal satTo) {
        this.satTo = satTo;
    }

    @Basic
    @Column(name = "sat_from")
    public BigDecimal getSatFrom() {
        return satFrom;
    }

    public void setSatFrom(BigDecimal satFrom) {
        this.satFrom = satFrom;
    }

    @Basic
    @Column(name = "sat_act", length = 4000)
    public String getSatAct() {
        return satAct;
    }

    public void setSatAct(String satAct) {
        this.satAct = satAct;
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
    @Column(name = "pr_direction_id", length = 4000)
    public String getPrDirectionId() {
        return prDirectionId;
    }

    public void setPrDirectionId(String prDirectionId) {
        this.prDirectionId = prDirectionId;
    }

    @Basic
    @Column(name = "mon_to")
    public BigDecimal getMonTo() {
        return monTo;
    }

    public void setMonTo(BigDecimal monTo) {
        this.monTo = monTo;
    }

    @Basic
    @Column(name = "mon_from")
    public BigDecimal getMonFrom() {
        return monFrom;
    }

    public void setMonFrom(BigDecimal monFrom) {
        this.monFrom = monFrom;
    }

    @Basic
    @Column(name = "mon_act", length = 4000)
    public String getMonAct() {
        return monAct;
    }

    public void setMonAct(String monAct) {
        this.monAct = monAct;
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
    public Timestamp getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(Timestamp lastUpd) {
        this.lastUpd = lastUpd;
    }

    @Basic
    @Column(name = "fri_to")
    public BigDecimal getFriTo() {
        return friTo;
    }

    public void setFriTo(BigDecimal friTo) {
        this.friTo = friTo;
    }

    @Basic
    @Column(name = "fri_from")
    public BigDecimal getFriFrom() {
        return friFrom;
    }

    public void setFriFrom(BigDecimal friFrom) {
        this.friFrom = friFrom;
    }

    @Basic
    @Column(name = "fri_act", length = 4000)
    public String getFriAct() {
        return friAct;
    }

    public void setFriAct(String friAct) {
        this.friAct = friAct;
    }

    @Basic
    @Column(name = "end_work_dt")
    public Timestamp getEndWorkDt() {
        return endWorkDt;
    }

    public void setEndWorkDt(Timestamp endWorkDt) {
        this.endWorkDt = endWorkDt;
    }

    @Basic
    @Column(name = "end_break_dt")
    public Timestamp getEndBreakDt() {
        return endBreakDt;
    }

    public void setEndBreakDt(Timestamp endBreakDt) {
        this.endBreakDt = endBreakDt;
    }

    @Basic
    @Column(name = "end_break2_dt")
    public Timestamp getEndBreak2Dt() {
        return endBreak2Dt;
    }

    public void setEndBreak2Dt(Timestamp endBreak2Dt) {
        this.endBreak2Dt = endBreak2Dt;
    }

    @Basic
    @Column(name = "emp_id", length = 4000)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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
    public Timestamp getDbLastUpd() {
        return dbLastUpd;
    }

    public void setDbLastUpd(Timestamp dbLastUpd) {
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
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
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
    @Column(name = "ctl_action", length = 4000)
    public String getCtlAction() {
        return ctlAction;
    }

    public void setCtlAction(String ctlAction) {
        this.ctlAction = ctlAction;
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
        CxTxbSmeny that = (CxTxbSmeny) o;
        return Objects.equals(xIAmFreeTime, that.xIAmFreeTime) && Objects.equals(xIAmFree, that.xIAmFree) && Objects.equals(xFreezeEnd, that.xFreezeEnd) && Objects.equals(wedTo, that.wedTo) && Objects.equals(wedFrom, that.wedFrom) && Objects.equals(wedAct, that.wedAct) && Objects.equals(tueTo, that.tueTo) && Objects.equals(tueFrom, that.tueFrom) && Objects.equals(tueAct, that.tueAct) && Objects.equals(thurTo, that.thurTo) && Objects.equals(thurFrom, that.thurFrom) && Objects.equals(thurAct, that.thurAct) && Objects.equals(taskTime, that.taskTime) && Objects.equals(taskNum, that.taskNum) && Objects.equals(sunTo, that.sunTo) && Objects.equals(sunFrom, that.sunFrom) && Objects.equals(sunAct, that.sunAct) && Objects.equals(startWorkNextDt, that.startWorkNextDt) && Objects.equals(startWorkDt, that.startWorkDt) && Objects.equals(startBreakDt, that.startBreakDt) && Objects.equals(startBreak2Dt, that.startBreak2Dt) && Objects.equals(satTo, that.satTo) && Objects.equals(satFrom, that.satFrom) && Objects.equals(satAct, that.satAct) && Objects.equals(rowId, that.rowId) && Objects.equals(prDirectionId, that.prDirectionId) && Objects.equals(monTo, that.monTo) && Objects.equals(monFrom, that.monFrom) && Objects.equals(monAct, that.monAct) && Objects.equals(modificationNum, that.modificationNum) && Objects.equals(lastUpdBy, that.lastUpdBy) && Objects.equals(lastUpd, that.lastUpd) && Objects.equals(friTo, that.friTo) && Objects.equals(friFrom, that.friFrom) && Objects.equals(friAct, that.friAct) && Objects.equals(endWorkDt, that.endWorkDt) && Objects.equals(endBreakDt, that.endBreakDt) && Objects.equals(endBreak2Dt, that.endBreak2Dt) && Objects.equals(empId, that.empId) && Objects.equals(dbLastUpdSrc, that.dbLastUpdSrc) && Objects.equals(dbLastUpd, that.dbLastUpd) && Objects.equals(createdBy, that.createdBy) && Objects.equals(created, that.created) && Objects.equals(conflictId, that.conflictId) && Objects.equals(ctlAction, that.ctlAction) && Objects.equals(ctlValidfrom, that.ctlValidfrom) && Objects.equals(ctlLoading, that.ctlLoading) && Objects.equals(ctlCsn, that.ctlCsn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xIAmFreeTime, xIAmFree, xFreezeEnd, wedTo, wedFrom, wedAct, tueTo, tueFrom, tueAct, thurTo, thurFrom, thurAct, taskTime, taskNum, sunTo, sunFrom, sunAct, startWorkNextDt, startWorkDt, startBreakDt, startBreak2Dt, satTo, satFrom, satAct, rowId, prDirectionId, monTo, monFrom, monAct, modificationNum, lastUpdBy, lastUpd, friTo, friFrom, friAct, endWorkDt, endBreakDt, endBreak2Dt, empId, dbLastUpdSrc, dbLastUpd, createdBy, created, conflictId, ctlAction, ctlValidfrom, ctlLoading, ctlCsn);
    }
}
