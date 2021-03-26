package org.example.model;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idReservation;
    
//    @DateTimeFormat(pattern = "yyyy-mm-dd")
//    @Temporal(TemporalType.DATE)

    private Date dateReservation;
    
    private boolean confirmation;
    @OneToMany(mappedBy = "reservation")
    private Collection<NbrPlace> nbrPlacetablesByIdReservation;
    @ManyToOne
    @JoinColumn(name = "idUsers")
    
    private Apprenant apprenant;

    public Reservation() {
    }

    public Reservation(Date dateReservation, boolean confirmation, Collection<NbrPlace> nbrPlacetablesByIdReservation, Apprenant apprenant) {
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.nbrPlacetablesByIdReservation = nbrPlacetablesByIdReservation;
        this.apprenant = apprenant;
    }
    
    

    public Reservation(Date dateReservation, boolean confirmation,Apprenant apprenant) {
        this.dateReservation = dateReservation;
        this.apprenant = apprenant;

      
    }
    
    public Reservation(Long idReservation, Date dateReservation, boolean confirmation, Apprenant apprenant) {
        this.idReservation = idReservation;
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.apprenant = apprenant;
    }
    
    

//    public Reservation(Long idReservation, Date dateReservation, boolean confirmation, Apprenant apprenant) {
//		super();
//		this.idReservation = idReservation;
//		this.dateReservation = dateReservation;
//		this.confirmation = confirmation;
//		this.apprenant = apprenant;
//	}

	public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public Collection<NbrPlace> getNbrPlacetablesByIdReservation() {
        return nbrPlacetablesByIdReservation;
    }

    public void setNbrPlacetablesByIdReservation(Collection<NbrPlace> nbrPlacetablesByIdReservation) {
        this.nbrPlacetablesByIdReservation = nbrPlacetablesByIdReservation;
    }

    public Apprenant getApprenant() {
        return apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation
				+ ", confirmation=" + confirmation + ", nbrPlacetablesByIdReservation=" + nbrPlacetablesByIdReservation
				+ ", apprenant=" + apprenant + "]";
	}
    
    
}
