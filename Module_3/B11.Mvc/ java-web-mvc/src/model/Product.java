package model;

public class Product {
    private int id;
    private String name;
    private float gia;
    private String moTa;
    private String nhaSx;

    public Product(int id, String name, float gia, String moTa, String nhaSx) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.moTa = moTa;
        this.nhaSx = nhaSx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }
}
