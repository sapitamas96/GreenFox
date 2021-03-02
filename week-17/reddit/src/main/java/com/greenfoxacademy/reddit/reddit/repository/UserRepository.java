package com.greenfoxacademy.reddit.reddit.repository;

import com.greenfoxacademy.reddit.reddit.modell.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
