package com.glory.glorygame.dao;

import com.glory.glorygame.model.User;

import java.util.List;

public interface AdminDao {
    public void frostUserByUserId(Integer userId);
    public List<User> findAllUser();
    public void deleteUserByUserId(Integer userId);
    public void unfreezeUserByUserId(Integer userId);
    public void hiddenPostByRoot(Integer postId);
    public void deletePostByRoot(Integer postId);
}
