package com.glory.glorygame.service;

import com.glory.glorygame.model.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> findCommentByPostId(Integer postId);
    public void sendComment(Comment comment);
    public void deleteCommentByPostId(Integer postId);
}
