package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.Reservation;
import org.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReservationContoller {
	
	@Autowired
	private 	UserDao userDao = new UserDaoImpl();
	
	//controller method to show the registration form
	
	@RequestMapping(value = "/reservation", method = RequestMethod.GET )
	public String register(Model theModel) {
		Reservation reservation = new Reservation();
		List<Reservation> reservations=new ArrayList<Reservation>();
		theModel.addAttribute("reservation", reservation);
		System.out.println(reservation);
		
		return "reservation";
		
		
		
	}
	
	
	

}
