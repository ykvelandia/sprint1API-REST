package com.sprintAPIREST.sprint1APIREST.service;

import com.sprintAPIREST.sprint1APIREST.model.User;

import java.util.HashMap;

public interface UserService {
    HashMap<String, User> findAllUser();
    User findUserByDocument(String document);
    User findUsersById(Integer id);
    User createUser(User user);
    User updateUser(String document, User user);
    User deleteUser (String document);
}
