package org.example.dao;

import java.util.List;

import org.example.model.Reservation;


public interface ReservationDao {
	    
	    
	    public  void createReservation(Reservation reservation);
	    public Reservation getReservationById(long id);
	    public List<Reservation> getAllReservation();
	    public void dropReservation(long id);
	    public Reservation updateReservation(Reservation reservation);
	    
	    
}
