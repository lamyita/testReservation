//package org.example.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.logging.Logger;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.example.service.EtudiantService;
//import org.example.service.EtudiantServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping(value = "/")
//public class LoginController {
//	
//	
//	 @Autowired
//		private SessionFactory sessionFactory;
//	 
//	    private static Logger log = Logger.getLogger(LoginController.class);
//	 
//	    // Checks if the user credentials are valid or not.
//	    @RequestMapping(value = "/validate", method = RequestMethod.POST)
//	    public ModelAndView validateUsr(@RequestParam("email")String email, @RequestParam("password")String password) {
//	        String msg = "";
//	        boolean isValid = SessionFactory.findUser(email, password);
//	        log.info("Is user valid?= " + isValid);
//	 
//	        if(isValid) {
//	            msg = "Welcome " + email + "!";
//	        } else {
//	            msg = "Invalid credentials";
//	        }
//	 
//	        return new ModelAndView("result", "output", msg);
//	    }
//}
