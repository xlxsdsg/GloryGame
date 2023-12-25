package com.glory.glorygame.dao;

import com.glory.glorygame.model.User;
import org.springframework.stereotype.Component;


public interface UserDao {
    public User findUserByEmail(String email);
    public void register(User user);
    public void userEdit(User user);
}
