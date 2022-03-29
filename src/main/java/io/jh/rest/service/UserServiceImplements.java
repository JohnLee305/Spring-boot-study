package io.jh.rest.service;

import io.jh.rest.entity.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class UserServiceImplements implements UserService{
    @Override
    public String register(User newUser) {
        return null;
    }

    @Override
    public void modify(User newUser) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public User find(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
