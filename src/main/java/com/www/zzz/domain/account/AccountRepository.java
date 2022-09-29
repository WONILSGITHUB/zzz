package com.www.zzz.domain.account;

import com.www.zzz.dto.account.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account, String> {
    List<Account> findByUsername(String s);
}
