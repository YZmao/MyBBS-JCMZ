package com.jcmz.model;

public class Postpage {
    private Integer id;

    private String pagename;

    private Integer pagestatus;

    private Integer pagemanagerid;

    private String pageremark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename == null ? null : pagename.trim();
    }

    public Integer getPagestatus() {
        return pagestatus;
    }

    public void setPagestatus(Integer pagestatus) {
        this.pagestatus = pagestatus;
    }

    public Integer getPagemanagerid() {
        return pagemanagerid;
    }

    public void setPagemanagerid(Integer pagemanagerid) {
        this.pagemanagerid = pagemanagerid;
    }

    public String getPageremark() {
        return pageremark;
    }

    public void setPageremark(String pageremark) {
        this.pageremark = pageremark == null ? null : pageremark.trim();
    }
}