package org.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.example.dao.ApprenantDao;
import org.example.dao.ApprenantDaoImpl;
import org.example.dao.UserDao;

import org.example.dao.UserDaoImpl;
import org.example.model.Apprenant;
import org.example.model.Roles;
import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class RegistreController {
	
//	
//	@Autowired
//	private 	UserDao userDao = new UserDaoImpl(); 
//	

    //@Autowired
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
	
	//controller method to process the registration form
//	@RequestMapping(value ="/Register", method = RequestMethod.POST)
//	public String Register(@ModelAttribute("users") Users users) {
//		userDao.createUser(users);
//		System.out.println("register done");
//		return "redirect:/";
//	}
//	
//	
	
	
	
//	@RequestMapping(value ="/Register", method = RequestMethod.POST)
////	public String login(HttpServletRequest request, HttpSession session, Model model)
//
//	public String Register(HttpServletRequest request, HttpSession session, @ModelAttribute("users") Users users) {
//		String pasword = request.getParameter("pass");
//		if(pasword.equals(users.getPassword())){
//		Roles role = userDao.getRoleById(2);
//		
//		System.out.println(role);
//
//				users.setRoles(role);	
//			userDao.createUser(users);
//
//			
//		System.out.println("register done");
//		return "redirect:/";
//	}
//	
//	else
//		return "login";
//}
//	
	
	@RequestMapping(value ="/Register", method = RequestMethod.POST)
    public String Register(@ModelAttribute("users") Apprenant users) {
        //UserDao userDao = new UserDaoImpl();
        Roles role=new Roles();
        role.setIdRole(2L);
        users.setRoles(role);
        userDao.creatApprenant(users);
        System.out.println("register done");
        return "redirect:/login";
	
	
	
	}
}
	
	
	
	
	
	
	

