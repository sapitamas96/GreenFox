package com.greenfoxacademy.reddit.reddit.services;

import com.greenfoxacademy.reddit.reddit.modell.User;
import com.greenfoxacademy.reddit.reddit.repository.UserRepository;

public interface UserService {

    User findByName(String username);
}
