package org.example.test;

import org.example.model.*;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        Apprenant apprenant =new Apprenant();
        Admin admin = new Admin();
        Roles roles = new Roles();
        Users users = new Users("lamyaa","lamyaa","lamyaa@gmail.com","admin",roles);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();

        session.save(users);
        transaction.commit();

    }
}