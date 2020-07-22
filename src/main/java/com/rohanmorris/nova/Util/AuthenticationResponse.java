package com.rohanmorris.nova.Util;

public class AuthenticationResponse {
    private final String jwt;

    /**
     * @param jwt
     */
    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}