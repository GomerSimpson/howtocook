package com.howtocook.dao.interfeices;

import com.howtocook.domain.User;

/**
 * @author Viktar Kolbik
 * @since 6/19/17
 */
public interface UserDao {
    int add(User user);
    void update(User user);
    void remove(int userId);
}
