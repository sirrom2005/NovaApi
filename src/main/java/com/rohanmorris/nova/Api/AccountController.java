package com.rohanmorris.nova.Api;

import java.util.List;

import javax.validation.Valid;

import com.rohanmorris.nova.Model.Account;
import com.rohanmorris.nova.Service.AccountService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/accounts")
@RestController
public class AccountController {
    private AccountService srv;

    public AccountController(AccountService srv) {
        this.srv = srv;
    }

    @PostMapping()
    public long create(@Valid @RequestBody Account account) {
        return srv.create(account);
    }

    @GetMapping()
    public List<Account> read() {
        return srv.read();
    }
}