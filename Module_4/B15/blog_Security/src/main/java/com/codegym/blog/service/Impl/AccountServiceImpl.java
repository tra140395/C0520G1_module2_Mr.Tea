package com.codegym.blog.service.Impl;

import com.codegym.blog.model.Account;
import com.codegym.blog.repository.AccountRepository;
import com.codegym.blog.service.AccountService;
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
