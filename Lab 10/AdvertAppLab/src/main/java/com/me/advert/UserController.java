package com.me.advert;

import com.me.dao.UserDAO;
import com.me.exception.AdvertException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.me.pojo.User;

@Controller
public class UserController {
	@GetMapping("user/register.htm")
	public String showRegistrationForm(ModelMap model) {
		User user = new User(); // FormBackingObject
		// User user = userdao.get(); //normally we retrieve from database
		model.addAttribute("user", user);
		return "addUserForm";
	}

	@PostMapping("user/register.htm")
	public String handleRegistrationForm(@ModelAttribute("user") User user, BindingResult result,
			SessionStatus status, UserDAO userdao) throws AdvertException {
		if (result.hasErrors())
			return "addUserForm";
		else {
                    
                    userdao.create(user);
			status.setComplete();
			return "addedUser";
		}
	}
}
