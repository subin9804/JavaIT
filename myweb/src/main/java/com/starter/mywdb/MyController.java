package com.starter.mywdb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/")
	public String home() {
		return "index";		// 해당 html파일을 열어줌
	}
	
	@GetMapping("/keyboard")
	public String keyboardPage(Model model) {
		return "keyboard";	// keyboard.html 열기
	}
	
	@GetMapping("/result")
	public String resultPage(Model model, @RequestParam("id") String name) {
		if(name.equalsIgnoreCase("1234")) {
			model.addAttribute("re","로그인");		// re = 로그인;
		}else {
			model.addAttribute("re","아이디 없음");	// re = 아이디 없음;
		}
		return "result";	//result.html 열기
			
	}
}
//equalsIgnoreCase: 대소문자를 무시
