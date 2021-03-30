package org.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.example.model.Roles;
import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@Autowired

	@Qualifier("UserService")
	private UserService userService;

	static Users user;

//
//	@RequestMapping(value = "/Login", method = RequestMethod.POST)
//	public String login(HttpServletRequest request, HttpServletResponse response, Model model) throws ClassNotFoundException, SQLException
//			 {
//
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		
//		System.out.println(email);
//		System.out.println(password);
//
//		if (userService.validate(email, password) == true) {
//		
//
//			System.out.println("login successful");
//			return "redirect:/test";
//		} else {
//			return "redirect:/login";
//		}
//	}
//	 static Users user;
	    Roles role;

	    @RequestMapping(value = "/Login", method = RequestMethod.POST)
	    public String login(HttpServletRequest request, HttpServletResponse response,Model model) throws SQLException, ClassNotFoundException {

	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        System.out.println(email);
	        System.out.println(password);
	        if (userService.validate(email, password) == "admin") {

	            System.out.println("login successful");
	            return "redirect:/reservation";
	        } if (userService.validate(email, password) == "student") {
	            user =userService.getByEmail(email);

	            HttpSession hSession = request.getSession(true);
	            System.out.println(user.getIdUsers());
	            hSession.setAttribute("id_user", user.getIdUsers());
	            hSession.setAttribute("nom", user.getNom());
	            hSession.setAttribute("prenom", user.getPrenom());
	            String name = user.getNom();
	            System.out.println(name);
	            System.out.println(user.getIdUsers());
	            model.addAttribute("user",user);
	            System.out.println("login successful");
	            return "redirect:/test";
	        }else {
	            return "redirect:/login";
	        }
	    }

//	@RequestMapping(value = "/Login", method = RequestMethod.POST)
//	public String login(HttpServletRequest request, HttpSession session, Model model)
//			throws SQLException, ClassNotFoundException {
//
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		System.out.println(email);
//		System.out.println(password);
//
//		if (userService.validate(email, password) == true) {
//			user = userService.getByEmail(email);
//
//			session.setAttribute("userId", user.getIdUsers());
//			session.setAttribute("role", user.getRoles());
//
//			String nom = user.getNom();
//			String prenom = user.getPrenom();
//			if (user.getRoles().getRoleType().equals("admin")) {
//				model.addAttribute("model", nom);
//				model.addAttribute("model", prenom);
//				return "redirect:/reservation";
//			}
//
//			else if(user.getRoles().getRoleType().equals("student")) {
//				model.addAttribute("model", nom);
//				model.addAttribute("model", prenom);
//				System.out.println(nom);
//				return "redirect:/test";
//			}
//
//		} else {
//			System.out.println("Compte not found");
//			return "redirect:/login";
//		}
//		return null;
//	}
	
	
	
	@RequestMapping("/logOut")
    public String logout(HttpSession session) {
        session.invalidate();
        System.out.println("logout succeed");
        return "redirect:/login";
    }

//	String email = Request.getParameter("userEmail");
//    String password = request.getParameter("userPassword");

//    Users users = userService.getByEmail(email);

//	@RequestMapping(value = "/Login", method = RequestMethod.POST)
//	public String login(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
//			 {
//			String email = request.getParameter("userEmail");
//		    String password = request.getParameter("userPassword");
//
//		if (users != null) {
//	        if (password.equals(users.getPassword())) {
//	            
//	            if (users.getRole().equals("admin")) {
//	                session.setAttribute("id", users.getId());
//	                session.setAttribute("role", users.getRole());
//	                return "redirect:/admin";
//	            }else {    
//	                if(users.getState().equals("active")){
//	                    session.setAttribute("id", users.getId());
//	                    session.setAttribute("role", users.getRole());
//	                    return "redirect:/reservation";
//	                }else {
//	                    System.out.println("inactive user, check with the administration");
//	                    return "redirect:/";
//	                }
//	            }
//	        }else {
//	            return "redirect:/";
//	        }
//	    }else {
//	        System.out.println("user doesn't exist");
//	    } 
//		
//		
//	}

}