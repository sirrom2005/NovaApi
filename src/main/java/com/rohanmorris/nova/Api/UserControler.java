package com.rohanmorris.nova.Api;

import com.rohanmorris.nova.Service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserControler
 */
@RequestMapping("api/v1/user")
@RestController
public class UserControler {

    private final UserService obj;

    public UserControler(UserService obj) {
        this.obj = obj;
    }

    @GetMapping("{username/password}")
    public int User(String username, String password) {
        obj.Login(username, password);
        return 0;
    }

}