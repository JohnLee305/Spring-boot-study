package io.jh.rest.store.logic;

import io.jh.rest.entity.User;
import io.jh.rest.store.UserStore;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository //bean객체로 등록
public class UserStoreLogic implements UserStore {

    private Map<String, User> userMap;

    public UserStoreLogic(){
        this.userMap = new HashMap<>();
    }

    @Override
    public String Create(User newUser) {
        this.userMap.put(newUser.getId(), newUser);
        return newUser.getId();

    }

    @Override
    public void Update(User newUser) {
        this.userMap.put(newUser.getId(), newUser);
    }

    @Override
    public void Delete(String id) {
        this.userMap.remove(id);
    }

    @Override
    public User retrieve(String id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> retrieveAll() {
        return this.userMap.values().stream().collect(Collectors.toList());
    }
}
