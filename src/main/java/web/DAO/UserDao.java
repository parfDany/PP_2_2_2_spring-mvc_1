package web.DAO;

import web.Model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public User getById(Long id);
    public void remove(Long id);

    public void modify(User user);

    public List<User> listUser();


}
