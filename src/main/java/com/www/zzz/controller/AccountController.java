package com.www.zzz.controller;

import com.www.zzz.dto.account.AccountResponse;
import com.www.zzz.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/account")
    public AccountResponse findById() {
        System.err.println("account");
        return accountService.getList();
    }
}