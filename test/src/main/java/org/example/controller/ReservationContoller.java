package org.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.Apprenant;
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
//	@Autowired
//  	private UserDao userDao = new UserDaoImpl();
// 

	
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
		   reservation.setApprenant((Apprenant) LoginController.user);
		   reservationService.addReservation(reservation);
   	        System.out.println("all is good");
           return new ModelAndView("redirect:/");
       }

	   
	   
	   
	   @RequestMapping(value = "deleteReservation", method = RequestMethod.POST)
       public String deleteReservation(HttpServletRequest request){
            Long id = Long.valueOf(request.getParameter("id"));
            reservationService.deleteReservation(id);
            return "redirect:/reservation";
       }


    @RequestMapping(value = "AccpterReservation", method = RequestMethod.POST)
    public String accepterReservation(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        Reservation reservation =reservationService.getReservation(id);
        reservation.setConfirmation(true);
        reservationService.updateReservation(reservation);
        return "redirect:/reservation";
    }
	   
	   


}
