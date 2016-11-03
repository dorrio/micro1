package com.jd.openshift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorHola {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hola Mundo";
	}

}