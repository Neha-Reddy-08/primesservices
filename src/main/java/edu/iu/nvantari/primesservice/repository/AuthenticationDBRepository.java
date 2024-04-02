package edu.iu.nvantari.primesservice.repository;

import edu.iu.nvantari.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository
        extends CrudRepository<Customer,String> {
    Customer findByUsername(String username);
}
