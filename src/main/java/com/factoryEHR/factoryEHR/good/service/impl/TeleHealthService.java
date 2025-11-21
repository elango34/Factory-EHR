package com.factoryEHR.factoryEHR.good.service.impl;

import org.springframework.stereotype.Service;

import com.factoryEHR.factoryEHR.good.repo.AppointmentRepo;
import com.factoryEHR.factoryEHR.good.service.AppointmentService;

@Service("telehealth")
public class TeleHealthService implements AppointmentService {

    private AppointmentRepo repo;

    public TeleHealthService(AppointmentRepo repo) {
        this.repo = repo;
    }
    
    public void book() {
        // handle the logic specific for this tele health service
        System.out.println("Generating zoom link");
        System.out.println("Sending email to patient");
        repo.save("telehealth");
    }
}
