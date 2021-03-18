//package org.example.repository;
//
//import java.util.List;
//
//import org.example.model.Users;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//@Repository
//public class UserRepository {
//	
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	@Transactional
//	public Users getByEmail(String email) {
//		
//		Session session = sessionFactory.getCurrentSession();
//		
//		Query query = session.createQuery("from Users u where u.email=:email");
//		query.setParameter("email", email);
//		
//		
////		List<Users> users = query.get
////		
////		if (users.size() > 0) {
////			Users user = users.get(0);
////			return user;
////		}
////		
////		return null;
////	}
//	
//
//}
