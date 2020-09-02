package bo;

import model.User;

import java.util.List;

public interface UserBO {
    List<User> findAll();

    boolean save(User user);

    List<User> findByCountry(String country);

    boolean validateId();
    List<User> sortByName();
    List<User> findAllWithProcedure();
    User findById(int id);
    int editUser(User user);
    void deleteUser(int id);
}
