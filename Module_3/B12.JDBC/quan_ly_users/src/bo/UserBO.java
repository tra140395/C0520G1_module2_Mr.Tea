package bo;

import model.User;

import java.util.List;

public interface UserBO {
    List<User> findAll();

    boolean save(User user);

    List<User> findByCountry(String country);

    boolean validateId();
    List<User> sortByName();
}
