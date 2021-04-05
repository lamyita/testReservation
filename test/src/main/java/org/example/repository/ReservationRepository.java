package org.example.repository;

import java.sql.SQLException;
import java.util.List;

import org.example.model.Reservation;
import org.example.model.Users;

public interface ReservationRepository {
	
//    public List<Reservation> getAllReservationByIdStudent(Long id);
//	 public List<Reservation> getResByUser(long idUsers );
	 public List<Reservation> getResByUser(Users userEntity);

}
