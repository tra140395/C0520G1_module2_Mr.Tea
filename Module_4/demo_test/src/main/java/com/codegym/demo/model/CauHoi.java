package com.codegym.demo.model;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class CauHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCauHoi;
    @NotBlank(message = "Không được để trống!")
    @Size(min = 5,max = 100,message = "Tu 5 den 100 ky tu!")
    private String tieuDe;
    @NotBlank(message = "Không được để trống!")
    @Size(min = 5,max = 100,message = "Tu 10 den 500 ky tu!")
    private String noiDung;
    @NotBlank(message = "Không được để trống!")
    private String traLoi;
    @NotBlank(message = "Không được để trống!")
    private String loaiCauHoi;
    @NotBlank(message = "Không được để trống!")
    private String ngayTaoCauHoi;
    @NotBlank(message = "Không được để trống!")
    private String nguoiTaoCauHoi;
    @NotBlank(message = "Không được để trống!")
    private String nguoiPhanHoi;
    @NotBlank(message = "Không được để trống!")
    private String status;

    public int getIdCauHoi() {
        return idCauHoi;
    }

    public void setIdCauHoi(int idCauHoi) {
        this.idCauHoi = idCauHoi;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getTraLoi() {
        return traLoi;
    }

    public void setTraLoi(String traLoi) {
        this.traLoi = traLoi;
    }

    public String getLoaiCauHoi() {
        return loaiCauHoi;
    }

    public void setLoaiCauHoi(String loaiCauHoi) {
        this.loaiCauHoi = loaiCauHoi;
    }

    public String getNgayTaoCauHoi() {
        return ngayTaoCauHoi;
    }

    public void setNgayTaoCauHoi(String ngayTaoCauHoi) {
        this.ngayTaoCauHoi = ngayTaoCauHoi;
    }

    public String getNguoiTaoCauHoi() {
        return nguoiTaoCauHoi;
    }

    public void setNguoiTaoCauHoi(String nguoiTaoCauHoi) {
        this.nguoiTaoCauHoi = nguoiTaoCauHoi;
    }

    public String getNguoiPhanHoi() {
        return nguoiPhanHoi;
    }

    public void setNguoiPhanHoi(String nguoiPhanHoi) {
        this.nguoiPhanHoi = nguoiPhanHoi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
