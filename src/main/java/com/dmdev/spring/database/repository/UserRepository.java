package com.dmdev.spring.database.repository;

import com.dmdev.spring.database.ConnectionPool;

public class UserRepository {

    private final ConnectionPool connectionpool;

    public UserRepository(ConnectionPool connectionpool) {
        this.connectionpool = connectionpool;
    }
}
