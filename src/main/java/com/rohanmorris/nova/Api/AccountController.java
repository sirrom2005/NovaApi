package com.rohanmorris.nova.Api;

import java.util.List;

import javax.validation.Valid;

import com.rohanmorris.nova.Interface.IAccount;
import com.rohanmorris.nova.Model.Account;
import com.rohanmorris.nova.Service.AccountService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/accounts")
@RestController
public class AccountController implements IAccount {
    private AccountService srv;

    public AccountController(AccountService srv) {
        this.srv = srv;
    }

    @PostMapping()
    @Override
    public long create(@Valid @RequestBody Account account) {
        return srv.create(account);
    }

    @GetMapping()
    @Override
    public List<Account> read() {
        return srv.read();
    }

    @GetMapping("{id}")
    @Override
    public Account findById(@PathVariable("id") long id) {
        return srv.findById(id);
    }

    @PutMapping("{id}")
    @Override
    public Account update(@PathVariable("id") long id, @Valid @RequestBody Account account) {
        return srv.update(id, account);
    }
}