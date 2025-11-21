package com.factoryEHR.factoryEHR.good.repo;

import org.springframework.stereotype.Repository;

@Repository
public class AppointmentRepo {
    

    public void save(String type) {
        System.out.println("The "+ type+ " Appointment has been saved in the db successfully");
    }
}
