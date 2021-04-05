package org.example.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//controller annotation used to implement Web Application
@Controller
public class AdminController {

	@Autowired
	private UserService userService ;
	
	
	
	
	@RequestMapping(value = "/usersTable" )
	public ModelAndView listUsers(ModelAndView theModel) throws IOException, ClassNotFoundException, SQLException {
		List<Users> listUsers = userService.findAll();
        theModel.addObject("listUsers", listUsers);
        theModel.setViewName("usersTable");

        
        return theModel;
	}
	
	 @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
	    public String deleteUser(HttpServletRequest request) throws ClassNotFoundException, SQLException{
		  Long id = Long.valueOf(request.getParameter("id"));
      userService.delete(id);  
      	return "redirect:/usersTable";
 }


	
}
