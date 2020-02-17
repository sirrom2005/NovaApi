package com.rohanmorris.nova.Interface;

import com.rohanmorris.nova.Model.Account;
import java.util.List;

public interface IAccount {
    public long create(Account account);

    public Account update(long id, Account account);

    public List<Account> read();

    public Account findById(long id);
}