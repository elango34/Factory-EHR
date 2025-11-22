package com.factoryEHR.factoryEHR.good.service.impl;

import org.springframework.stereotype.Service;

import com.factoryEHR.factoryEHR.good.repo.AppointmentRepo;
import com.factoryEHR.factoryEHR.good.service.AppointmentService;

@Service("ivr-patient")
public class IvrPatientService implements AppointmentService {
    private AppointmentRepo repo;

    public IvrPatientService(AppointmentRepo repo) {
        this.repo = repo;
    }

    public void book() {
        System.out.println("checkign room availability");
        System.out.println("Printing patient ticket");
        repo.save("ivrPatient");
    }
}
