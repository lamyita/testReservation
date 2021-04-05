package org.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.example.model.Apprenant;
import org.example.model.Reservation;
import org.example.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HistoriqueReservationController {
	private static final int Reservation = 0;

	@Autowired
	ReservationRepository reservationRepository;
	
//	@RequestMapping(value = "/historiqueUser" )
//	public ModelAndView list(ModelAndView theModel , HttpSession session, Model model, Apprenant apprenant) throws IOException {
//		Long userId = (Long) session.getAttribute("id");
//		List<Reservation> reservations = reservationRepository.getResByUser((long) userId);
//		apprenant.setReservation(reservations);
//		System.out.print(apprenant);
//		model.addAttribute("list", reservations);	 
//        theModel.setViewName("historiqueUser");
//        return theModel;
//	}
	
	@RequestMapping(value = "/historiqueUser")
    public String historiqueUser(ModelAndView theModel,Model model, HttpServletRequest req){
            List<Reservation> list = reservationRepository.getResByUser(LoginController.user);
            model.addAttribute("listReservation", list);
        
        return "historiqueUser";
    }
	
	

}
