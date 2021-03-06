package org.example.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.example.model.Apprenant;
import org.example.model.Reservation;
import org.example.model.Users;
import org.example.repository.ReservationRepository;
import org.example.service.ReservationService;
import org.example.service.UserService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationContoller {

	
	private static final int Reservation = 0;
//	@Autowired
//  	private UserDao userDao = new UserDaoImpl();
// 
	@Autowired
	private UserService userService;
	
	@Autowired
    private ReservationService reservationService;
	

	
//	@Autowired
//	private ReservationRepository reservationRepository;
//	
	@RequestMapping(value = "/reservation", method = RequestMethod.GET )
	   public ModelAndView listReservation(ModelAndView theModel) throws IOException, ClassNotFoundException, SQLException {
		List<Reservation> listReservation = reservationService.getAllReservation();
		theModel.addObject("listReservation", listReservation);
		theModel.setViewName("reservation");
        return theModel;
	
	}
	
	
	@RequestMapping(value = "/usersTable", method = RequestMethod.GET )
	   public ModelAndView listUsers(ModelAndView theModel) throws IOException, ClassNotFoundException, SQLException {
		List<Users> listUsers = userService.findAll();
		theModel.addObject("listUsers", listUsers);
				theModel.setViewName("usersTable");
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
       public ModelAndView saveReservation(HttpServletRequest req) throws ParseException {
		   Reservation reservation = new Reservation();
		   String date = req.getParameter("date");
		   String type = req.getParameter("typeReservation");
		   reservation.setDateReservation(date);
		   reservation.setTypeReservation(type);
		
		   System.out.println(date+ type);
		   reservation.setApprenant((Apprenant) LoginController.user);
		   reservationService.addReservation(reservation);
   	        System.out.println("all is good");
           return new ModelAndView("redirect:/historiqueUser");
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
