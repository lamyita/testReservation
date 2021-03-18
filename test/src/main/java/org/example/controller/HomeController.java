package org.example.controller;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.service.EtudiantService;
import org.example.service.EtudiantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.example.model.Apprenant;
import org.example.service.*;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired
	private EtudiantService etudiantService;


	//@RequestMapping(value="/")
	////public ModelAndView test(HttpServletResponse response, ModelMap modelMap) throws IOException, ClassNotFoundException, SQLException{
		//modelMap.put("etudiants", etudiantService.findAll());
	//	return new ModelAndView("test");
//	}

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
	
     @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public String login() {
	      return "login";
	  }
     
     @RequestMapping(value = "/formreservation", method = RequestMethod.GET)
	   public String formreservation() {
	      return "formreservation";
	  }
     
     @RequestMapping(value = "/editReservation", method = RequestMethod.GET)
	   public String editReservation() {
	      return "editReservation";
	  }
  
     
//     @RequestMapping(value ="/login" ,method= RequestMethod.POST)
// 	public ModelAndView register(@ModelAttribute("apprenant") Apprenant apprenant, BindingResult bindingResult){
// 		if(bindingResult.hasErrors()){
// 			return new ModelAndView("register");
// 		}
// 		getApprenantService().registerApprenant(apprenant);
//
// 		ModelAndView modelAndView = new ModelAndView("confirmation");
// 		modelAndView.addObject("apprenant", apprenant);
// 		return modelAndView;
// 	}
     
     
//     private void authenticate(HttpServletRequest request, HttpServletResponse response)
// 			throws Exception {
// 		String email = request.getParameter("email");
// 		String password = request.getParameter("password");
//
// 		if (ApprenantService.validateApprenant(email, password) == true) {
// 			login();
// 		} else {
// 			throw new Exception("Login not successful..");
// 		}
// 	}
//	
     
     
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	public String index(ModelMap modelMap) throws ClassNotFoundException, SQLException {
//		modelMap.put("etudiants", etudiantService.findAll());
//		return "test";
//	}
}
