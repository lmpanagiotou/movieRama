package dao;

import entities.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();
}
