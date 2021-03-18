package org.example.dao;

import java.util.List;

import org.example.model.Apprenant;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class ApprenantDaoImpl  implements ApprenantDao {
       Session session;
	@Override
	public void creatApprenant(Apprenant apprenant) {
		session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(apprenant);
        session.getTransaction().commit();		
	}

	@Override
	public Apprenant getApprenant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apprenant> getAllApprenant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dropApprenant(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Apprenant updateApprenant(Apprenant apprenant) {
		// TODO Auto-generated method stub
		return null;
	}

}
