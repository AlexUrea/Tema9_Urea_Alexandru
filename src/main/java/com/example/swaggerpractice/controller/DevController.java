package com.example.swaggerpractice.controller;

import com.example.swaggerpractice.model.Customer;
import com.example.swaggerpractice.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Profile("dev")
public class DevController {
    @Autowired
    Service customerService;

    @GetMapping("/dev/id/{id}")
    public Customer customersById(@PathVariable Integer id){
        return customerService.getById(id);
    }
}
