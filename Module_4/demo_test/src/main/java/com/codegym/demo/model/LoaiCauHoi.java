package com.codegym.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoaiCauHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLoaiCauHoi;
    private String tenLoaiCauHoi;

    public int getIdLoaiCauHoi() {
        return idLoaiCauHoi;
    }

    public void setIdLoaiCauHoi(int idLoaiCauHoi) {
        this.idLoaiCauHoi = idLoaiCauHoi;
    }

    public String getTenLoaiCauHoi() {
        return tenLoaiCauHoi;
    }

    public void setTenLoaiCauHoi(String tenLoaiCauHoi) {
        this.tenLoaiCauHoi = tenLoaiCauHoi;
    }
}
