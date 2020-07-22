package com.rohanmorris.nova.Service;

import java.util.Optional;

import com.rohanmorris.nova.Model.MyUserDetails;
import com.rohanmorris.nova.Model.User;
import com.rohanmorris.nova.Repo.IUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    IUserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Optional<User> user = repo.findByusername(username);

        if(!user.isPresent()){
            throw new UsernameNotFoundException("Not found: " + username);
        }
        
        return user.map(MyUserDetails::new).get();
    }
}