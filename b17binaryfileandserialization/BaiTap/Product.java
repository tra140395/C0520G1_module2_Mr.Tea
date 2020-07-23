package b17binaryfileandserialization.BaiTap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private  String producer;
    private int price;
    private String moreInformation;

    public Product(int id, String name, String producer, int price, String moreInformation) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.moreInformation = moreInformation;
    }

    public Product() {
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMoreInformation() {
        return moreInformation;
    }

    public void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }
}
