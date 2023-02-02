package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String mainPage(Model model) {
		String str = "안녕하세요, 반갑습니다";
		model.addAttribute("m1", str);		// (변수명, 전달할 문자열)
		return "main";		// main.jsp를 열어라
	}
	
	@GetMapping("/next")
	public String nextPage(Model model, @RequestParam("input_name")String inputName) {
		String str = "";
		if(inputName.equalsIgnoreCase("spring")) {
			str = "관리자 모드 입력 완료";
		}else {
			str = inputName;
		}
		model.addAttribute("m2", str);
		return "next";		// next.jsp를 열어라
	}
}
