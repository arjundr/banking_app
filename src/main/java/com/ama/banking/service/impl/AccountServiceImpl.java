package com.ama.banking.service.impl;

import org.springframework.stereotype.Service;

import com.ama.banking.dto.AccountDto;
import com.ama.banking.entity.Account;
import com.ama.banking.mapper.AccountMapper;
import com.ama.banking.repository.AccountRepository;
import com.ama.banking.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		 Account account = AccountMapper.mapToAccount(accountDto);
		 Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
