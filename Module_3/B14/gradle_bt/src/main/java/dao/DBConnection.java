package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private static Connection connection;

  public static Connection getConnection(){
     try{
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","5991341");
     } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
     }
     return connection;
  }

  public static void close(){
     try {
         if(connection != null)
             connection.close();
     } catch (SQLException throwable) {
         throwable.printStackTrace();
     }
  }

}
