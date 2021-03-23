package org.example.repository;

import java.sql.SQLException;

import org.example.model.Users;

public interface UserRepository {

    public boolean validate(String email,  String password)throws SQLException, ClassNotFoundException;


}
