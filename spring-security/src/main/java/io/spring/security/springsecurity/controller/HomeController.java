package io.spring.security.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getHome() {
		return("<H1>Hello!</H1>");
	}
	
	@GetMapping("/user")
	public String getUser() {
		return("<H1>Welcome User</H1>");
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return("<H1>Welcome Admin</H1>");
	}
	

}
