package com.qphone.PoJo;

public class Leave {
    private int Lid;
    private String LContent;
    private String LReason;
    private String LDays;

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getLContent() {
        return LContent;
    }

    public void setLContent(String LContent) {
        this.LContent = LContent;
    }

    public String getLReason() {
        return LReason;
    }

    public void setLReason(String LReason) {
        this.LReason = LReason;
    }

    public String getLDays() {
        return LDays;
    }

    public void setLDays(String LDays) {
        this.LDays = LDays;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "Lid=" + Lid +
                ", LContent='" + LContent + '\'' +
                ", LReason='" + LReason + '\'' +
                ", LDays='" + LDays + '\'' +
                '}';
    }
}
