package com.glory.glorygame.service;

import com.glory.glorygame.model.User;

import java.util.List;

public interface AdminService {
    public void frostUserByUserId(Integer userId);
    public List<User> findAllUser();
    public void deleteUserByUserId(Integer userId);
    public void unfreezeUserByUserId(Integer userId);
    public void hiddenPostByRoot(Integer postId);
    public void deletePostByRoot(Integer postId);
}
