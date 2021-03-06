package com.example.swaggerpractice.repository;

import com.example.swaggerpractice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer getById(Integer id);
}
