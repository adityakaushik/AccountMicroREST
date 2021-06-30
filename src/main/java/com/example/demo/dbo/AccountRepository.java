package com.example.demo.dbo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
