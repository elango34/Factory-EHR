package com.factoryEHR.factoryEHR.bad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoryEHR.factoryEHR.bad.service.BadAppointmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/bad")
public class BadAppointmentController {
    // receives request

    // let's autowire the service so that we can call it from here
    private BadAppointmentService service;

    public BadAppointmentController(BadAppointmentService service) {
        this.service = service;
    }

    @PostMapping("/book")
    public String bookAppointment(@RequestBody String type) {
        service.bookAppointment(type);
        return "Booked "+ type;
    }
    
}