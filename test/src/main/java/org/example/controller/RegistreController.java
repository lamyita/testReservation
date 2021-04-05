package org.example.controller;

import org.example.dao.ApprenantDao;
import org.example.dao.ApprenantDaoImpl;
import org.example.model.Apprenant;
import org.example.model.Roles;
import org.example.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class RegistreController {
	
//	
//	@Autowired

    private ApprenantDao userDao = new ApprenantDaoImpl();
	
	//controller method to show the registration form
	
	@RequestMapping(value = "/Register", method = RequestMethod.GET )
	public String register(Model theModel) {
		
		Users users = new Users();
		// if registered redirect the user to home
		// else continue
		theModel.addAttribute("users", users);
		System.out.println(users);
		return "register";
	}
	
	
	
	@RequestMapping(value ="/Register", method = RequestMethod.POST)
    public String Register(@ModelAttribute("users") Apprenant users, Model model) {
        //UserDao userDao = new UserDaoImpl();
        Roles role=new Roles();
        role.setIdRole(2L);
        users.setRoles(role);
        userDao.creatApprenant(users);
        System.out.println("register done");
        model.addAttribute("msg1", "Register Done");
        return "login";
	
	
	
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	

