package dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    boolean save(User user);

    List<User> findByCountry(String country);
    List<User> sortByName();

}
