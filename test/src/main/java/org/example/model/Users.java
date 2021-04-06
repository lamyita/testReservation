package org.example.model;

import javax.persistence.*;


import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
/* ORM Object Relational Mapping qui permet de faciliter le d�veloppement.
 *  Hibernate permet  repr�senter une base de donn�es en objets Java et vice versa. */



@Entity  ////annotation marks this class as an entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@NamedQuery(query = "SELECT u FROM Users u where u.email = :email", name = "userByEmail")
public class Users implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
   @GeneratedValue (strategy = GenerationType.IDENTITY) //annotation specifies that a value will be automatically generated for that field. 
    @Column(name = "user_id")
    private Long idUsers;
    private String nom;
    private String prenom;
    private String email;
    @Length(min = 8, max = 16, message = "The field must be at least 8 characters")
    private String password;
    
    @OneToOne (mappedBy = "users")
    private Admin admin;
    
    @OneToOne (mappedBy = "users")
    private Apprenant apprenant;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;
    
//   private boolean confirmationStud = false;

    public Users() {
    }

    
//    public Users(String nom, String prenom, String email, String password, Roles roles, boolean confirmationStud) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//		this.email = email;
//		this.password = password;
//		this.roles = roles;
//		this.confirmationStud = confirmationStud;
//	}


	public Users( String nom, String prenom, String email, String password, Admin admin, Apprenant apprenant, Roles roles) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.admin = admin;
        this.apprenant = apprenant;
        this.roles = roles;
    }
    public Users( String nom, String prenom, String email, String password, Roles roles) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Users(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;

    }


    public Users(Long idUsers, String nom, String prenom, String email, String password, Roles roles) {
        this.idUsers = idUsers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Long getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Long idUsers) {
        this.idUsers = idUsers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Apprenant getApprenant() {
        return apprenant;
        
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    
//	public boolean isConfirmationStud() {
//		return confirmationStud;
//	}
//
//	public void setConfirmationStud(boolean confirmationStud) {
//		this.confirmationStud = confirmationStud;
//	}

	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
				+ password + ", admin=" + admin + ", apprenant=" + apprenant + ", roles=" + roles + "]";
	}

	


}
