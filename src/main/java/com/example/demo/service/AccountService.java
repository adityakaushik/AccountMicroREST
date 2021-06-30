package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dbo.AccountRepository;
import com.example.demo.pojos.Account;

@Service
public class AccountService {
	
@Autowired 
AccountRepository acctRepo;


	public String saveCustomer(Account acct) {
		acctRepo.save(acct);
		return "Customer saved: "+acct.getAccount(); 
	}
}
