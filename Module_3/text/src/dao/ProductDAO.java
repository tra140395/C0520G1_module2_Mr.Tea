package dao;

import model.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> findAll();

    void saveProduct(Product product);

    List<Product> searchByName(String name);

    Product findById(int id);

    void editProduct(Product product);

    void deleteProduct(int id);
}
