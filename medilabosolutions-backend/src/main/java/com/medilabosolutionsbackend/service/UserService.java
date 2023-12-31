package com.medilabosolutionsbackend.service;

import com.medilabosolutionsbackend.model.User;
import com.medilabosolutionsbackend.repository.UserRepository;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }


    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        Optional<User> oUser = userRepository.findByUsername(username);
        if (oUser.isPresent()) {
            Logger.info("User with username : " + username + " found");
        } else {
            Logger.info("User with username : " + username + " not found");
        }
        return oUser.get();

    }
}
