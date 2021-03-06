package com.callsign.ticketly.repository;

import com.callsign.ticketly.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

    public Customer findByEmail(String email);

}
