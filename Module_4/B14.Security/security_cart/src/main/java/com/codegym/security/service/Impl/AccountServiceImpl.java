package com.codegym.security.service.Impl;

import com.codegym.security.model.Account;
import com.codegym.security.repository.AccountRepository;
import com.codegym.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }
}
