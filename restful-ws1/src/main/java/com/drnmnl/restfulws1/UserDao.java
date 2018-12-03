package com.drnmnl.restfulws1;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*UserDao acts as DAO layer in this class.
Data is stored in an ArrayList, not a database.
CRUD methods are also implemented.*/


@Repository
public class UserDao {
    private static List<User> users = new ArrayList<>();
    private int usersCount = 3;

    static {
        users.add(new User (1, "Adam", new Date()));
        users.add(new User (2, "Eve", new Date()));
        users.add(new User (3, "Darren", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId()==null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if(user.getId()==id) {
                return user;
            }
        }
        return null;
    }


}
