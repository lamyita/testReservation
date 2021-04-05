package org.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Reservation;
import org.example.model.Users;
import org.example.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepositoryImpl  implements ReservationRepository{
	
Session session;
	@Override
	public List<Reservation> getResByUser(Users userEntity) {
    session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();    
    Query query = session.createQuery(" From Reservation where apprenant.id=:userId  ");
    query.setParameter("userId", userEntity.getIdUsers());
    List<Reservation> reservationList = query.list();

		return reservationList;
	}
	
//	@Override
//	public List<Reservation> getResByUser(long idUsers) {
//        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        List <Reservation> reservation = new ArrayList<Reservation>();
//        Query query = session.createQuery("select u from  from Reservation u  where u.users.idUsers =:idUsers  ");
//        query.setParameter("idUsers", idUsers);
//       
//
//        try {
//            Apprenant user = (Apprenant) query.uniqueResult();
//            reservation = user.getReservations();
//        } catch (Exception e) {
//            System.out.println("no results found in the database");
//        }
//      session.getTransaction().commit();
//      
//        return reservation;
//	}
//
//	@Override
//	publicpublic List<Reservation> getResByUser(long idUsers) {
//	        session = HibernateUtil.getSessionFactory().openSession();
//
//		    List<Reservation> reservations ;
//		    Query  query = session.createQuery("from Reservation r  where r.apprenant.idUsers= :id");
////		    Query<Reservation> query = session.createQuery("from Reservation r  where r.apprenant.idUsers= :id", Reservation.class);
//
//		    query.setParameter("id", id);
//		    try {
//
//		     
//		        reservations = query.list();
//		    } finally {
//		        if (session != null) {
//		            session.close();
//		        }
//
//		    }
//		    return reservations;
//
//}

//	 public List<Reservation> getResByUser(long idUsers) {
//
//       session = HibernateUtil.getSessionFactory().openSession();
//
//
//	        List reservations = null;
//
//	        try {
//
//	            Query query = session.createQuery(" from Reservation u  where u.users.idUsers =:user_id");
//
//	            query.setParameter("idUsers", idUsers);
//
//	            reservations = (List) query.uniqueResult();
//	        } finally {
//	            if (session != null) {
//	                session.close();
//	            }
//
//	        }
//	        return reservations;
//	    }


}