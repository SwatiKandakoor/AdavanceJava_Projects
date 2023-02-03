package com.xworkz.usingbootstrap.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.usingbootstrap.dto.InterviewDto;

@Component
@RequestMapping("/ready")
public class InterviewComponent {
	
	public InterviewComponent() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onReady( InterviewDto dto) {
		System.out.println("running onReady post....");
		System.out.println("dto :"+dto);
		return "interview.jsp";
	}

}
