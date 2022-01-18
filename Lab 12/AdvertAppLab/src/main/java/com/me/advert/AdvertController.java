package com.me.advert;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.me.pojo.Advert;
import com.me.pojo.Category;

@Controller
public class AdvertController {
	@GetMapping("advert/add.htm")
	public String showAdvertForm(ModelMap model) {
		Advert advert = new Advert(); // FormBackingObject
		// User user = userdao.get(); //normally we retrieve from database
		model.addAttribute("advert", advert);
		return "addAdvertForm";
	}

	@PostMapping("advert/add.htm")
	public String handleAdvertForm(@ModelAttribute("advert") Advert advert, BindingResult result, SessionStatus status) {
		if (result.hasErrors())
			return "addAdvertForm";
		else {
			status.setComplete();
			return "addedAdvert";
		}
	}
	
	@GetMapping("advert/list.htm")
	public String listAdvert() {
		return "viewAdvert";
	}
}