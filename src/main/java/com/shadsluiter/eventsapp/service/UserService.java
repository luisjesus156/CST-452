
package com.shadsluiter.eventsapp.service;

import com.shadsluiter.eventsapp.models.UserModel;
import com.shadsluiter.eventsapp.repositories.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositoryInterface userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(UserModel user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        user.setRoles("USER");
        userRepository.save(user);
    }

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }
}
