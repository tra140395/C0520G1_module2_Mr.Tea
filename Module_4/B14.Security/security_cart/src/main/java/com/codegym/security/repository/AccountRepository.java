package com.codegym.security.repository;

import com.codegym.security.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUserName(String accountName);
}
