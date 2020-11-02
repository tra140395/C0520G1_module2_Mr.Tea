package dao;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO{

    private final String editProduct = "update product set name = ?,price = ?," +
            " quantity = ?, color = ?, description = ?, category = ? where id = ?;";

    private final String insertProduct = "insert into product(name,price,quantity,color," +
            "description,category) values (?,?,?,?,?,?);";

    @Override
    public List<Product> findAll() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement  = null;
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = null;
        if (connection != null){
            try {
                statement = connection.prepareStatement("select * from product;");
                resultSet = statement.executeQuery();
                Product product = null;
                while (resultSet.next()){
                    product = new Product();
                    product.setId(resultSet.getInt("id"));
                    product.setName(resultSet.getString("name"));
                    product.setPrice(resultSet.getDouble("price"));
                    product.setQuantity(resultSet.getInt("quantity"));
                    product.setColor(resultSet.getString("color"));
                    product.setDescription(resultSet.getString("description"));
                    product.setCategory(resultSet.getString("category"));
                    productList.add(product);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return productList;
    }

    @Override
    public void saveProduct(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement(insertProduct);
                statement.setString(1,product.getName());
                statement.setDouble(2,product.getPrice());
                statement.setInt(3,product.getQuantity());
                statement.setString(4,product.getColor());
                statement.setString(5,product.getDescription());
                statement.setString(6,product.getCategory());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Product> productList = new ArrayList<>();

        if(connection != null){
            try {
                statement = connection.prepareStatement("select * from product where name like ?;");
                statement.setString(1,"%" + name + "%");
                resultSet = statement.executeQuery();
                Product product= null;
                while (resultSet.next()){
                    product = new Product();
                    product.setId(resultSet.getInt("id"));
                    product.setName(resultSet.getString("name"));
                    product.setPrice(resultSet.getDouble("price"));
                    product.setQuantity(resultSet.getInt("quantity"));
                    product.setColor(resultSet.getString("color"));
                    product.setDescription(resultSet.getString("description"));
                    product.setCategory(resultSet.getString("category"));
                    productList.add(product);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Product product = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("select * from product where id = ?;");
                statement.setInt(1,id);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    product = new Product();
                    product.setId(resultSet.getInt("id"));
                    product.setName(resultSet.getString("name"));
                    product.setPrice(resultSet.getDouble("price"));
                    product.setQuantity(resultSet.getInt("quantity"));
                    product.setColor(resultSet.getString("color"));
                    product.setDescription(resultSet.getString("description"));
                    product.setCategory(resultSet.getString("category"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return product;
    }

    @Override
    public void editProduct(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null){
            try {
                statement  = connection.prepareStatement(editProduct);
                statement.setString(1,product.getName());
                statement.setDouble(2,product.getPrice());
                statement.setInt(3,product.getQuantity());
                statement.setString(4,product.getColor());
                statement.setString(5,product.getDescription());
                statement.setString(6,product.getCategory());
                statement.setInt(7,product.getId());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("delete from product where id = ?;");
                statement.setInt(1,id);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

}
