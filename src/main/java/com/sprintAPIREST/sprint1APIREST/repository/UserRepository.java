package com.sprintAPIREST.sprint1APIREST.repository;

import com.sprintAPIREST.sprint1APIREST.model.User;

import java.util.HashMap;

public interface UserRepository {
    HashMap<String, User> findAllUser();
    User findUserByDocument(String document);
    User findUsersById(Integer id);
    User createUser(User user);
    User updateUser(String document, User user);
    User deleteUser(String document);
}
