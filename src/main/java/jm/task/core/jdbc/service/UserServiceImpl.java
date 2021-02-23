package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl service = new UserDaoJDBCImpl();

    @Override
    public void createUsersTable() {
        service.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        service.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        service.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        service.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        service.cleanUsersTable();
    }
}
