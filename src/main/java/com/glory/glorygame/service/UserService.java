package com.glory.glorygame.service;

import com.glory.glorygame.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void register(User user);
    public void userEdit(User user);
    public Integer loginCheck(User user);
    public Integer registerCheck(User user);
}
