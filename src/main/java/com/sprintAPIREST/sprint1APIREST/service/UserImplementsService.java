package com.sprintAPIREST.sprint1APIREST.service;

import com.sprintAPIREST.sprint1APIREST.model.User;
import com.sprintAPIREST.sprint1APIREST.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class UserImplementsService implements UserService{
    @Autowired //forma de atributo
    //@Qualifier("userHashmapImplementsRepository")
    @Qualifier("userListImplementsRepository")
    private UserRepository userRepository;

    @Override
    public HashMap<String, User> findAllUser() {
        return userRepository.findAllUser();
    }

    @Override
    public User findUserByDocument(String document) {
        return userRepository.findUserByDocument(document);
    }

    @Override
    public User findUsersById(Integer id) {
        return userRepository.findUsersById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User updateUser(String document, User user) {
        return userRepository.updateUser(document,user);
    }

    @Override
    public User deleteUser(String document) {
        return null;
    }
}
