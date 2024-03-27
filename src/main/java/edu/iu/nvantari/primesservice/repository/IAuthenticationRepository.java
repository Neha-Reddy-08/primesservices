package edu.iu.nvantari.primesservice.repository;

import edu.iu.nvantari.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String Username) throws IOException;
}
