package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private float gia;

    public Product() {
    }

    public Product(int id, String name, float gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
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
}
