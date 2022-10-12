package net.ilya.springbootapp.service;

import net.ilya.springbootapp.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUsers();

    public User findById(Long id);

    public User saveUser(User user);

    public void deleteUser(Long id);
}
