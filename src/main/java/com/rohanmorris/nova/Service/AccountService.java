package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Interface.IAccount;
import com.rohanmorris.nova.Model.Account;
import com.rohanmorris.nova.Repo.AccountRepo;

import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccount {
    private AccountRepo repo;

    /**
     * @param repo
     */
    public AccountService(AccountRepo repo) {
        this.repo = repo;
    }

    @Override
    public long create(Account account) {
        return repo.create(account);
    }

    @Override
    public List<Account> read() {
        return repo.read();
    }
}