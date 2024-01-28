package com.sprintAPIREST.sprint1APIREST.repository.arrayListrepository;

import com.sprintAPIREST.sprint1APIREST.model.User;
import com.sprintAPIREST.sprint1APIREST.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Repository
public class UserListImplementsRepository implements UserRepository {

    private List<User> userlist = new ArrayList<>();
    @Override
    public HashMap<String, User> findAllUser() {
        return null;
    }

    @Override
    public User findUserByDocument(String document) {
        return userlist.get(Integer.parseInt(document));
    }

    @Override
    public User findUsersById(Integer id) {
        return userlist.get(id);
    }

    @Override
    public User createUser(User user) {
        if(userlist.add(user)){
            return user;
        }else{
            return null;
        }
    }
    @Override
    public User updateUser(String document, User user) {
        userlist.add(Integer.parseInt(document),user);
        return null;
    }

    @Override
    public User deleteUser(String document) {
        return null;
    }

}
