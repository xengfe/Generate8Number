package com.yskj.pojo;

import java.util.Date;

public class CrmBloodpressure {
    private String cId;

    private String cUid;

    private String cDid;

    private Long cDsync;

    private Date cTime;

    private Short cPreh;

    private Short cPrel;

    private Short cRate;

    private Short cFlag;

    private Short cRes;

    private Short cCtype;

    private Short cUpload;

    private Date cCreatetime;

    private String cClientip;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcUid() {
        return cUid;
    }

    public void setcUid(String cUid) {
        this.cUid = cUid == null ? null : cUid.trim();
    }

    public String getcDid() {
        return cDid;
    }

    public void setcDid(String cDid) {
        this.cDid = cDid == null ? null : cDid.trim();
    }

    public Long getcDsync() {
        return cDsync;
    }

    public void setcDsync(Long cDsync) {
        this.cDsync = cDsync;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Short getcPreh() {
        return cPreh;
    }

    public void setcPreh(Short cPreh) {
        this.cPreh = cPreh;
    }

    public Short getcPrel() {
        return cPrel;
    }

    public void setcPrel(Short cPrel) {
        this.cPrel = cPrel;
    }

    public Short getcRate() {
        return cRate;
    }

    public void setcRate(Short cRate) {
        this.cRate = cRate;
    }

    public Short getcFlag() {
        return cFlag;
    }

    public void setcFlag(Short cFlag) {
        this.cFlag = cFlag;
    }

    public Short getcRes() {
        return cRes;
    }

    public void setcRes(Short cRes) {
        this.cRes = cRes;
    }

    public Short getcCtype() {
        return cCtype;
    }

    public void setcCtype(Short cCtype) {
        this.cCtype = cCtype;
    }

    public Short getcUpload() {
        return cUpload;
    }

    public void setcUpload(Short cUpload) {
        this.cUpload = cUpload;
    }

    public Date getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(Date cCreatetime) {
        this.cCreatetime = cCreatetime;
    }

    public String getcClientip() {
        return cClientip;
    }

    public void setcClientip(String cClientip) {
        this.cClientip = cClientip == null ? null : cClientip.trim();
    }
}