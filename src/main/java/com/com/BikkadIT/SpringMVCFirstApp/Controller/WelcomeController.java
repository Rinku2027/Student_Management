package com.com.BikkadIT.SpringMVCFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {

	public WelcomeController() {

		super();
		System.out.println("WElcome Class Controller");
	}

	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg() {
		String msg = "Welcome  Rinku";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE", msg);
		mav.setViewName("welcome");

		return mav;

	}

	
}
