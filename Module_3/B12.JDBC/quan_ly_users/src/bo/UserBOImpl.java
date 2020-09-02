package bo;

import dao.UserDAOImpl;
import dao.UserDao;
import model.User;

import java.util.List;

public class UserBOImpl implements UserBO{
    private UserDao userDao = new UserDAOImpl();

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userDao.findByCountry(country);
    }

    @Override
    public boolean validateId() {
        return false;
    }

    @Override
    public List<User> sortByName() {
        return userDao.sortByName();
    }
}
