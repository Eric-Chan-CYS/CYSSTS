package com.cvicse.spring;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Hello {

	@RequestMapping("/test1.do")
	public String hello1() {
		String str = new String();
		str = "HelloWorld.jsp";
		
		System.out.print(str);
		
		return str;
	}
	@RequestMapping("/test2.do")
	public String hello2(Model model,String username,String Password) {
		
//		List newList = new ArrayList();
//		Map newMap = new HashMap();
//		newMap.put("username",username);
//		newMap.put("password",Password);
//		newList.add(newMap);
		model.addAttribute("username", username);
		model.addAttribute("password", Password);
		
		return "test2.jsp";
	}
	
	
}
