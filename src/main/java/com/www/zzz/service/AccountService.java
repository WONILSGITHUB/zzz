package com.www.zzz.service;

import com.www.zzz.domain.account.AccountRepository;
import com.www.zzz.dto.account.Account;
import com.www.zzz.dto.account.AccountResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountResponse getList() {
        System.err.println("getList");
        List<Account> accounts = accountRepository.findAll();
        List<Account> o = accountRepository.findByUsername("zzz");
        System.err.println(accounts);
        System.err.println("o"+o);
        return new AccountResponse(accounts);
    }
}