package org.example.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn(name ="user_id" )
public class Admin extends Users implements Serializable {

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Admin() {

    }

    public Admin(Users users) {
        this.users = users;
    }

    public Admin(String nom, String prenom, String email, String password, Roles roles, Users users) {
        super(nom, prenom, email, password, roles);
        this.users = users;
    }
}
