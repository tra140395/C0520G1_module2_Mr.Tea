package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDao{
    @Override
    public List<User> findAll() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement("select * from users");
                resultSet = statement.executeQuery();
                User user = null;
                while (resultSet.next()) {
                    user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setEmail(resultSet.getString("email"));
                    user.setCountry(resultSet.getString("country"));
                    userList.add(user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException throwable) {
                    throwable.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return userList;
    }

    @Override
    public boolean save(User user) {
      Connection connection = DBConnection.getConnection();
      PreparedStatement statement = null;
      int count = 0;
      if(connection != null){
          try {
             statement = connection.prepareStatement("insert into users(name,email,country) value (?,?,?);");
              statement.setString(1, user.getName());
              statement.setString(2, user.getEmail());
              statement.setString(3, user.getCountry());
              count = statement.executeUpdate();
          } catch (SQLException throwable) {
              throwable.printStackTrace();
          }finally {
              try {
                  statement.close();
              } catch (SQLException throwable) {
                  throwable.printStackTrace();
              }
              DBConnection.close();
          }
      }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<User> findByCountry(String country) {
        return null;
    }
}
