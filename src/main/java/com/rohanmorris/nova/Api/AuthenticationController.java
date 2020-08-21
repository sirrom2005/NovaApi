package com.rohanmorris.nova.Api;

import com.rohanmorris.nova.Model.AuthenticationRequest;
import com.rohanmorris.nova.Model.MyUserDetails;
import com.rohanmorris.nova.Service.MyUserDetailsService;
import com.rohanmorris.nova.Util.AuthenticationResponse;
import com.rohanmorris.nova.Util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/authentication")
@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailsService myUserDetailsService;
    @Autowired
    private JwtUtil jwtTokenUtil;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        }catch(BadCredentialsException e){
            throw new Exception("Incorrect username or password", e);
        }
        
        final MyUserDetails userDetails = (MyUserDetails) myUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtTokenUtil.generateToken(userDetails);
        
        return ResponseEntity.ok(new AuthenticationResponse(userDetails.getId(), userDetails.getFullname(), jwt));
    }
}