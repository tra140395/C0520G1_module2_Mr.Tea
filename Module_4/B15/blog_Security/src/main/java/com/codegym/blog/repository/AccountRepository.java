package com.codegym.blog.repository;

import com.codegym.blog.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUserName(String accountName);
}
