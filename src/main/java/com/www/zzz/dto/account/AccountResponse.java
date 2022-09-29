package com.www.zzz.dto.account;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class AccountResponse {
    private List<Account> accounts;

    public AccountResponse(List<Account> list){
        this.accounts = list;
    }
}