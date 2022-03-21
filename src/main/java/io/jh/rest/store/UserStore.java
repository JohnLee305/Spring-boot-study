package io.jh.rest.store;

import io.jh.rest.entity.User;

import java.util.List;

public interface UserStore {
    String Create(User newUser);
    void Update(User newUser);
    void Delete(String id);

    User retrieve(String id);
    List<User> retrieveAll();
}
