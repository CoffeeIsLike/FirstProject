package com.coffee.practice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
		
	// /home.do 요청에 대해 처리할 메소드 .do 는 생략 가능하다
	@RequestMapping("/home.do") 
	public String home(HttpServletRequest request) {
		
		// /WEB-INF/views/home.jsp 페이지로 forward 이동해서 응답
		return "home";
	}
	
	// aspect 테스트용 메소드 
	@RequestMapping("/aspect/home")
	public ModelAndView authHome(HttpServletRequest request, ModelAndView mView) {
		
		mView.setViewName("home");
		return mView;
	}	
	
}
