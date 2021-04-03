package org.example.repository;

import java.sql.SQLException;
import java.util.List;

import org.example.model.Reservation;

public interface ReservationRepository {
	
    public List<Reservation> getAllReservationByIdStudent(Long id);


}
