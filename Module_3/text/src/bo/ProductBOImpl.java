package bo;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import model.Product;

import java.util.List;

public class ProductBOImpl implements ProductBO{

    ProductDAO productDAO = new ProductDAOImpl();

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productDAO.searchByName(name);
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Override
    public void editProduct(Product product) {
        productDAO.editProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
