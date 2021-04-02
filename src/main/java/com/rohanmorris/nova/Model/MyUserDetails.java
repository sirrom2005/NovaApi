package com.rohanmorris.nova.Model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails 
{
    /**
     *
     */
    private static final long serialVersionUID = -3178192010407040733L;
    private long id;
    private String fullname;
    private String username;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authority;

    public MyUserDetails() {
    }

    public MyUserDetails(User user) {
        this.fullname   = user.getFullname();
        this.id         = user.getId();
        this.username   = user.getUsername();
        this.password   = user.getPassword();
        this.active     = user.getActive()==1 ? true : false;
        this.authority  = Arrays.stream(user.getRole().split(","))
                                .map(SimpleGrantedAuthority::new)
                                .collect(Collectors.toList());                  
	}

	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authority;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }

    public long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }
}