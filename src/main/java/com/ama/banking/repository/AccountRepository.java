package com.ama.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ama.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
