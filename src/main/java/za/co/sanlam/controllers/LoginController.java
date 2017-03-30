package za.co.sanlam.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	@RequestMapping(value="/api/user/login")
	public String login(ModelMap model){
		/*User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    model.addAttribute("username", user.getUsername());
	    model.addAttribute("password", user.getPassword());*/
	  return "Hello";
	}
}
