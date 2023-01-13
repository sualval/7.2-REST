package ru.netology.rest.repository;


import org.springframework.stereotype.Repository;
import ru.netology.rest.model.User;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class UserRepository {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public UserRepository() {

        users.put("user1", new User("user1", "pass1", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE)));

        users.put("user2", new User("user2", "pass2", List.of(Authorities.READ, Authorities.WRITE)));

        users.put("user3", new User("user3", "pass3", List.of(Authorities.READ)));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.isEmpty() || password.isEmpty() || !users.containsKey(user)) {
            return Collections.emptyList();
        } else {
            User currentUser;
            if ((currentUser = users.get(user)).getPassword().equals(password)) {
                return currentUser.getAuthoritiesOfUser();
            } else {
                return null;
            }
        }
    }
}





