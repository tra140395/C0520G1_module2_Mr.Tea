package b12collectionframework.Baitap;

public class Product {
    private String name;
    private int gia;

    public Product() {
    }

    public Product(String name, int gia) {
        this.name = name;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return name +":"+ gia+"K ";
    }
}
