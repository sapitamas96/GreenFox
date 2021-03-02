package com.greenfoxacademy.reddit.reddit.services;

import com.greenfoxacademy.reddit.reddit.modell.User;
import com.greenfoxacademy.reddit.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByName(String username) {
        return userRepository.findByUsername(username);
    }
}
