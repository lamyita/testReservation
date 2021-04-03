package org.example.repository;

import java.util.List;

import org.example.model.Reservation;
import org.example.model.Users;
import org.example.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

  
public class ReservationRepositoryImpl  implements ReservationRepository{
	Session session;

	@Override
	public List<Reservation> getAllReservationByIdStudent(Long id) {
	        session = HibernateUtil.getSessionFactory().openSession();

		    List<Reservation> reservations ;
		    Query  query = session.createQuery("from Reservation r  where r.apprenant.idUsers= :id");
//		    Query<Reservation> query = session.createQuery("from Reservation r  where r.apprenant.idUsers= :id", Reservation.class);

		    query.setParameter("id", id);
		    try {

		     
		        reservations = query.list();
		    } finally {
		        if (session != null) {
		            session.close();
		        }

		    }
		    return reservations;

}




}