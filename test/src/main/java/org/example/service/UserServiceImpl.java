package org.example.service;

import java.sql.SQLException;
import java.util.List;

import org.example.dao.UserDao;
import org.example.model.Roles;
import org.example.model.Users;
import org.example.repository.UserRepository;
import org.example.repository.UserRepositoryImpl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/* pour représenter une meilleure pratique. 
 * Par exemple, 
 * vous pouvez appeler directement une classe DAO pour conserver un objet dans votre base de données,
 *  Il est très bon d'appeler une classe de service qui appelle un DAO*/



@Service("UserService")

///// @Component (en pratique, ce sont deux implémentations différentes de la même interface
//@Component("UserService")
public class UserServiceImpl implements UserService  {
	
	  @Autowired
	    @Qualifier("UserDao")
	    private UserDao userDao ;
	  
	    private UserRepository userRepository =new UserRepositoryImpl();


	    @Override
	    @Transactional
	    public List<Users> findAll() throws ClassNotFoundException, SQLException {
	        return userDao.getAllUsers();
	    }
	    
	    
	    @Override
	    @Transactional
	    public Users findById(Long id) throws ClassNotFoundException, SQLException {
	        return userDao.getUserById(id);
	    }

	    @Override
	    @Transactional
	    public void save(Users user) throws ClassNotFoundException, SQLException {
	    userDao.createUser(user);
	    }

	    @Override
	    @Transactional
	    public void delete(Long id) throws ClassNotFoundException, SQLException {
	    userDao.dropUser(id);
	    }
	    
	    
	  
	    
	    
	    @Override
	    @Transactional
	    public String validate(String email, String password) throws ClassNotFoundException, SQLException {
	        return userRepository.validate(email, password);
	    }
	    

		@Override
		public Roles getByRole(Long id) throws ClassNotFoundException, SQLException {
			return userRepository.getByRole(id);
		}


		@Override
		public Users getByEmail(String email) throws ClassNotFoundException, SQLException {
			return userRepository.getByEmail(email);
		}


	   

		
		
	
}
