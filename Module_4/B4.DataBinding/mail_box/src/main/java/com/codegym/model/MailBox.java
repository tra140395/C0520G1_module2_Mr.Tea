package com.codegym.model;

public class MailBox {
    private String languages;
    private int pageSize;
    private boolean spams;
    private String signature;

    public MailBox() {
    }

    public MailBox(String languages, int pageSize, boolean spams, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spams = spams;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getSpams() {
        return spams;
    }

    public void setSpams(boolean spams) {
        this.spams = spams;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
