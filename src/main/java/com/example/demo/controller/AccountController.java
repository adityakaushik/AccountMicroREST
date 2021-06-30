package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojos.Account;
import com.example.demo.service.AccountService;

@Component
@RequestMapping("/adi")
@CrossOrigin(origins = "*")
public class AccountController {
	@Autowired
	AccountService custService;
	
	
	@PostMapping(value = "/addAccount")
	public String editAProperty(@RequestBody Account pc) throws IOException, Exception {
	
		System.out.println("asas");
		return custService.saveCustomer(pc);
	
	}
	
}
