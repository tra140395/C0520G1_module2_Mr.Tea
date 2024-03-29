package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Keo",3000,"ngot","Dong Tien"));
        products.put(2,new Product(2,"Bong",200000,"tron","Malaysia"));
        products.put(3,new Product(3,"Bang",10000,"den","Kim long"));
        products.put(4,new Product(4,"Ao",760000,"dai","Viet nam"));
        products.put(5,new Product(5,"Dep",43000,"2 chiec","Lao"));
        products.put(6,new Product(6,"Chan",800000,"day","Chinese"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
      return products.get(id);
    }
}
