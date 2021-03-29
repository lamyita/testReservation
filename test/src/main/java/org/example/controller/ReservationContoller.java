package org.example.controller;

import java.io.IOException;
import java.util.List;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.Reservation;
import org.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationContoller {
//	
	@Autowired
  	private UserDao userDao = new UserDaoImpl();
 
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
	   public ModelAndView listReservation(ModelAndView theModel) throws IOException {
		List<Reservation> listReservation = reservationService.getAllReservation();
		theModel.addObject("listReservation", listReservation);
		theModel.setViewName("reservation");
        return theModel;
	
	}
	

	   @RequestMapping(value = "/newReservation", method = RequestMethod.GET)
       public ModelAndView newRes(ModelAndView theModel) {
           Reservation reservation = new Reservation();
            theModel.addObject("reservation", reservation);
           theModel.setViewName("formReservation");
        System.out.println("yes can do new reservation");
           return theModel;
       }
	   

	   @RequestMapping(value = "/saveReservation", method = RequestMethod.POST)
       public ModelAndView saveReservation(@ModelAttribute Reservation reservation) {
		   reservationService.addReservation(reservation);
//		   userDao.getAllUsers(user);
   	        System.out.println("all is good");

           return new ModelAndView("redirect:/");
       }

	   
	   
	   
//
//	   @RequestMapping(value = "/formReservation", method = RequestMethod.GET)
//	    public ModelAndView newReserv(ModelAndView model) {
//		   Reservation reservation = new Reservation();
//	        model.addObject("reservation", reservation);
//	        model.setViewName("formReservation");
//	        return model;
//	    }
	   
	   
	   
//	   
//	   @RequestMapping(value = "/newReservation", method = RequestMethod.GET )
//		public String newReservati(Model theModel) {
//			
//		   Reservation reservation = new Reservation();
//			// if registered redirect the user to home
//			// else continue
//			theModel.addAttribute("reservation", reservation);
//			System.out.println(reservation);
//			return "formReservation";
//		}
	   
//	   @RequestMapping(value ="/saveReservation", method = RequestMethod.POST)
//		public String saveReservation(@ModelAttribute("reservation") Reservation reservation) {
//
//		   reservationDao.createReservation(reservation);
//			System.out.println("Reservation done");
//			return "redirect:/formReservation";
//		}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

//	    @RequestMapping(value = "/saveReservation", method = RequestMethod.POST)
//	    public ModelAndView saveReservation(@ModelAttribute Reservation reservation) {
//	    	if(reservation.getIdReservation() == 0) {
//	    		reservationService.addReservation(reservation);
//	    			
//	    		}else {
//	    			reservationService.updateReservation(reservation);
//	    	}
//	    	 return new ModelAndView("redirect:/");
//
//	    }
//		
	

}
