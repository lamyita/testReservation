package org.example.util;

import org.example.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory ;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Admin.class)
                    .addAnnotatedClass(Roles.class)
                    .addAnnotatedClass(NbrPlace.class)
                    .addAnnotatedClass(Apprenant.class)
                    .addAnnotatedClass(Reservation.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}