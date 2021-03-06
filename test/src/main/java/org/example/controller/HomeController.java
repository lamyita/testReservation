package org.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.example.model.Users;
//import org.example.service.EtudiantService;
//import org.example.service.EtudiantServiceImpl;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
///rest api r?ceptionner ou envoy?e des donn?es via des requetes http on n'an appliquer annotation @RestController



@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired

@Qualifier("UserService")
	private UserService userService;

	Users user;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

    @RequestMapping(value = "/home", method = RequestMethod.GET)
	   public String home() {
	      return "home";
	  }
  
	

     @RequestMapping(value = "/test", method = RequestMethod.GET)
	   public String test() {
	      return "test";
	  }
     
     

     @RequestMapping(value = "/register", method = RequestMethod.GET)
	   public String register() {
	      return "register";
	  }
     

     

 	
     @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public String login() {
	      return "login";
	  }
     
     @RequestMapping(value = "/formreservation", method = RequestMethod.GET)
	   public String formreservation() {
	      return "formreservation";
	  }
     
   
     
   //get login page
 	@RequestMapping(value="/login")
 	public String login(Model model) throws IOException{
		model.addAttribute("user", user);
 		return "login";
	}
 	
 	
 	  @RequestMapping(value = "/editReservation", method = RequestMethod.GET)
	   public String editReservation() {
	      return "editReservation";
	  }
  
     
 	  
 	 @RequestMapping(value = "/profileUser", method = RequestMethod.GET)
	   public String profileUser() {
	      return "profileUser";
	  }
 	 
   
 	 @RequestMapping(value = "/profileAdmin", method = RequestMethod.GET)
	   public String profileAdmin() {
	      return "profileAdmin";
	  }
 	 
 	

     @RequestMapping(value = "/historiqueUser", method = RequestMethod.GET)
	   public String historiqueUser() {
	      return "historiqueUser";
	  }
     
     @RequestMapping(value = "/historiqueAdmin", method = RequestMethod.GET)
	   public String historiqueAdmin() {
	      return "historiqueAdmin";
	  }
 	
     
     @RequestMapping(value = "/usersTable", method = RequestMethod.GET)
	   public String usersTable() {
	      return "usersTable";
	  }
	
}
