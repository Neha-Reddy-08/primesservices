package edu.iu.nvantari.primesservice.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.nvantari.primesservice.model.Customer;
import edu.iu.nvantari.primesservice.service.AuthenticationService;
import edu.iu.nvantari.primesservice.service.IAuthenticationService;
import edu.iu.nvantari.primesservice.service.TokenService;


import java.io.IOException;


@RestController
public class AuthenticationController {
    private  IAuthenticationService authenticationService;
    private  AuthenticationManager authenticationManager;
    private TokenService tokenService;

    public AuthenticationController(AuthenticationManager authenticationManager,IAuthenticationService authenticationService,TokenService tokenService) {
        this.authenticationManager=authenticationManager;
        this.authenticationService = authenticationService;
        this.tokenService= tokenService;
        System.out.println("hii");
    }
    @PostMapping("/register")
    public boolean register(@RequestBody Customer customer) {
        try {
            System.out.println("register");
            return authenticationService.register(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/login")
    public String login(@RequestBody Customer customer) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(customer.getUsername(), customer.getPassword()));
        return tokenService.generateToken(authentication);
    }
}
