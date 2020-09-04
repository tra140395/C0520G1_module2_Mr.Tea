package dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    boolean save(User user);

    List<User> findByCountry(String country);

    List<User> sortByName();

    List<User> findAllWithProcedure();

    User findById(int id);

    int editUser(User user);

    void deleteUser(int id);

    boolean swapIdTransaction(int id_1, int id_2);

}
