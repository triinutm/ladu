package ladu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EntranceAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView("WEB-INF/jsp/login.jsp");
		if(req.getParameter("denied") != null){
			if(req.getParameter("denied").equalsIgnoreCase("true")){
				mav.addObject("failed", "Login failed");
			}
		}
		return mav;
	}


}
