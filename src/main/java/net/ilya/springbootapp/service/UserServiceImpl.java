package net.ilya.springbootapp.service;

import net.ilya.springbootapp.repo.UserRepo;
import net.ilya.springbootapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

}
