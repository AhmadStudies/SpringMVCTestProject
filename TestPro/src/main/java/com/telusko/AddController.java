package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public String add(ModelMap map, HttpServletRequest request, HttpServletResponse response){
		AddService as = new AddService();
		int fnum = Integer.parseInt(request.getParameter("num1"));
		int snum = Integer.parseInt(request.getParameter("num2"));
		int hold = as.addMethod(fnum , snum);
		map.addAttribute("message", hold);
	
		return "res.jsp";
	}
}
