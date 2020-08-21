package com.rohanmorris.nova.Util;

public class AuthenticationResponse {
    private final long id;
    private final String username;
    private final String jwt;

    public AuthenticationResponse(long id, String username, String jwt) {
        this.id = id;
        this.username = username;
        this.jwt = jwt;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getJwt() {
        return jwt;
    }
}