package org.example.DaoImp;
import org.example.Dao.UsersDao;
import org.example.model.*;
import org.example.Dao.UsersDao;
import org.example.model.Roles;
import org.example.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Repository
public class UsersDaoImpl implements UsersDao {

    @Override
    public void addUser(Users user) {

    }

    @Override
    public List<Users> listUser() {
        return null;
    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public Users getUser(int id) {
        return null;
    }

    @Override
    public void editUser(Users user) {

    }

    @Override
    public Users findByLogin(String email) {
        return null;
    }

}