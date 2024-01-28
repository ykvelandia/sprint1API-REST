package com.sprintAPIREST.sprint1APIREST.repository.hashmaprepository;

import com.sprintAPIREST.sprint1APIREST.model.User;
import com.sprintAPIREST.sprint1APIREST.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class UserHashmapImplementsRepository implements UserRepository {
    //Instancia de HashMap
    private HashMap<String,User> userHashMap = new HashMap<>();

    @Override
    public HashMap<String, User> findAllUser() {
        return userHashMap;
    }

    @Override
    public User findUserByDocument(String document) {
        return userHashMap.get(document);
    }

    @Override
    public User findUsersById(Integer id) {
        return userHashMap.get(id);
    }

    @Override
    public User createUser(User user) {
        String userDocument= user.getDocument();
        return userHashMap.put(userDocument,user);
    }

    @Override
    public User updateUser(String document, User user) {
        return userHashMap.put(document,user);
    }

    @Override
    public User deleteUser(String document) {
        return userHashMap.remove(document);
    }
}
