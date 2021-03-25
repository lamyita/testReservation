package org.example.controller;

import java.io.IOException;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;

import org.example.dao.ReservationDao;
import org.example.dao.ReservationDaoImpl;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.Reservation;
import org.example.model.Users;
import org.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationContoller {
//	
//	@Autowired
//	private UserDao userDao = new UserDaoImpl();
//	@Autowired
//	private ReservationDao reservationDao = new ReservationDaoImpl();
	
////	
	
//	  private static final Logger logger = Logger
//	            .getLogger(ReservationContoller.class);
//	 
//	    public ReservationContoller() {
//	        System.out.println("ReservationContoller()");
//	    }
	
	@Autowired
    private ReservationService reservationService;
	
	@RequestMapping(value = "/reservation", method = RequestMethod.GET )
//	public String reservation(Model theModel) {
	   public ModelAndView listEmployee(ModelAndView theModel) throws IOException {
		List<Reservation> listReservation = reservationService.getAllReservation();
		theModel.addObject("listReservation", listReservation);
		theModel.setViewName("reservation");
        return theModel;
	
	}
	
//	
	//	Reservation reservation = new Reservation();
//	 List<Reservation> reservations = reservationDao.getAllReservation();
////		List<Reservation> reservations=new ArrayList<Reservation>();
//		theModel.addAttribute("reservations", reservations);
//		System.out.println(reservation);
//		
//		return "reservation";	
//	@Autowired
//	private ReservationDao reservationDao ;
//
//
//	
//	@Autowired
//	private UserDao userDao;
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//
//	@RequestMapping(value = "/reservation", method = RequestMethod.GET )
//	public String reservationFrom(Model theModel) {
//	    Reservation reservation = new Reservation();
//        List<Reservation> reservations = new ArrayList<Reservation>();
//        theModel.addAttribute("reservations", reservations);
//        System.out.println(reservations);
//        
//        return "reservation";
//	}
//	
	

}
