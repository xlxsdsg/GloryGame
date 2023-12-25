package com.glory.glorygame.dao;

import com.glory.glorygame.model.Comment;

import java.util.List;

public interface CommentDao {
    public List<Comment> findCommentByPostId(Integer postId);
    public void sendComment(Comment comment);
    public void deleteCommentByPostId(Integer postId);
}
