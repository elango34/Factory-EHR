package com.factoryEHR.factoryEHR.good.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoryEHR.factoryEHR.good.service.AppointmentFactory;
import com.factoryEHR.factoryEHR.good.service.AppointmentService;

@RestController
@RequestMapping("/api/good")
public class AppointmentController {
    

    // receives request

    // let's autowire the service so that we can call it from here
    private AppointmentFactory factory;

    public AppointmentController(AppointmentFactory factory) {
        this.factory = factory;
    }

    @PostMapping("/book")
    public String bookAppointment(@RequestBody String type) {
        
        // get the service
        AppointmentService service = factory.getService(type);
        
        // do the job
        service.book();

        return "Booked "+type;
    }

}
