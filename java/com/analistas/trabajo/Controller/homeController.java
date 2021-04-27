package com.analistas.trabajo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
	
	@GetMapping("/home")
    public String verHome(Model model) {
    
        return "home";
    }

}
