package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.annotations.Table;

@Entity
public class Account {
	
	@Column
	String account;
	@Id
	String acctid;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAcctid() {
		return acctid;
	}
	public void setAcctid(String acctid) {
		this.acctid = acctid;
	}
	
	
	
}
