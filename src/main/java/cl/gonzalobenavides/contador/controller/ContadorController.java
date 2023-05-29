package cl.gonzalobenavides.contador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@Controller
public class ContadorController {

	@RequestMapping("/")
	public String index(HttpSession sesh) {
		if(sesh.getAttribute("count") == null) {
			sesh.setAttribute("count", 0);
		}
		else {
			sesh.setAttribute("count", (Integer)sesh.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession sesh, Model model) {
		if(sesh.getAttribute("count") == null)
			sesh.setAttribute("count", 0);
		
		Integer count = (Integer) sesh.getAttribute("count");
		model.addAttribute("count", count);
		return "counter.jsp";
	}
}
