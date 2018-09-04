package cn.xiegz.study.service;


import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "3.hello jenkins "+ new Date()+" modified-1";
	}

}
