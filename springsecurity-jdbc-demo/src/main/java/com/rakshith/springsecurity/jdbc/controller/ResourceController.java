/**
 * 
 */
package com.rakshith.springsecurity.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rakshith_rathnakara
 *
 */
@RestController
public class ResourceController {
	
	@GetMapping("/")
	public String getResource() {
		return ("<h1>welcome<h1>");
	}
	
	
	@GetMapping("/admin")
	public String getAdmin() {
		return ("<h1>welcome Admin<h1>");
	}
	
	@GetMapping("/user")
	public String getUser() {
		return ("<h1>welcome user<h1>");
	}

}

