package com.factoryEHR.factoryEHR.bad.service;

import org.springframework.stereotype.Service;

import com.factoryEHR.factoryEHR.bad.repo.BadAppointmentRepo;

@Service
public class BadAppointmentService {
    
    // handles logic
    // currently we are handling the appointment type.
    // In this bad code, we are going to write multiple if else each will handle and do the logic.
    
    /*
        All the services, repo's, controller object will be created by spring
        You just need to use autowired annotation to inject the object
        from the service, we will call the repo method to save to db then use the autowired config.
        controller will call this method
    */ 

    private BadAppointmentRepo repo;

    // now the spring will check in the object pool for the repo object and it will assign it here
    public BadAppointmentService(BadAppointmentRepo repo) {
        this.repo = repo;
    }

    public BadAppointmentRepo getRepo() {
        return repo;
    }

    public void setRepo(BadAppointmentRepo repo) {
        this.repo = repo;
    }

    // now let's do the logic here
    public void bookAppointment(String type) {
        // so based on the type we are going to implement the logic

        if ("in-person".equalsIgnoreCase(type)) {
            System.out.println("Checking room availability");
            System.out.println("printing patient ticket");
        } else if ("telehealth".equalsIgnoreCase(type)) {
            System.out.println("Creating zoom link");
            System.out.println("Sending email invite");
        } else {
            throw new IllegalArgumentException("unknown type");
        }
    }

    
}
