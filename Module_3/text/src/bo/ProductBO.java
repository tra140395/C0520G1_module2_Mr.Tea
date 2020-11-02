package bo;

import model.Product;

import java.util.List;

public interface ProductBO {
    List<Product> findAll();

    void saveProduct(Product product);

    List<Product> searchByName(String name);

    Product findById(int id);

    void editProduct(Product product);

    void deleteProduct(int id);
}
