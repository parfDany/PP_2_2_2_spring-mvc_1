package web.Service;


import org.springframework.stereotype.Service;
import web.DAO.UserDao;
import web.Model.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public User getById(Long id) {
        return this.userDao.getById(id);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        this.userDao.remove(id);
    }

    @Override
    @Transactional
    public void modify(User user) {
        this.userDao.modify(user);
    }

    @Override
    @Transactional
    public List<User> listUser() {
        return this.listUser();
    }
}
