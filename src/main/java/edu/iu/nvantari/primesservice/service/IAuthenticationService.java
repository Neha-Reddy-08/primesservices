package edu.iu.nvantari.primesservice.service;

import edu.iu.nvantari.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;

    boolean login(String username, String password) throws IOException;
}
