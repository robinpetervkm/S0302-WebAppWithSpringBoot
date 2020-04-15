package com.norha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("welcome")
	public String welcome() {
		return "welcome.jsp ";
	}

}
