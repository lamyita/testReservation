package org.example.Dao;

import org.example.DaoImp.RoleUserImpl;
import org.example.model.Roles;

import java.util.List;

public interface RoleDaoImpl   {


    public void addRole(Roles roles);

    public List<Roles> listUserRole();

    public void removeUserRole(int id);

    public Roles getUserRole(int id);

    public Roles findRoleByName(String roles);
}
