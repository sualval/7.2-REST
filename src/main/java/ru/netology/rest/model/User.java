package ru.netology.rest.model;

import ru.netology.rest.repository.Authorities;

import java.util.List;

public class User {
    private final String name;
    private final String password;
    private final List<Authorities> authoritiesOfUser;

    public User(String name, String password, List<Authorities> authoritiesOfUser) {
        this.name = name;
        this.password = password;
        this.authoritiesOfUser = authoritiesOfUser;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthoritiesOfUser() {
        return authoritiesOfUser;
    }
}
