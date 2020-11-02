package com.codegym.test.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    @NotBlank(message = "Không được để trống!")
    @Size(min=5,max = 50,message = "Ten san pham co do dai tu 5 den 50 ky tu")
    private String name;
    @Min(value = 100000,message = "Gia phai la so va thap nhat la 100000")
    private int price;
    private String status= "dang dau gia";
    @ManyToOne()
    @JoinColumn(columnDefinition = "idProductType")
    private ProductType productType;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
