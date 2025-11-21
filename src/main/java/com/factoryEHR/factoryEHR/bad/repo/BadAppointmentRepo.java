package com.factoryEHR.factoryEHR.bad.repo;

import org.springframework.stereotype.Repository;

@Repository
public class BadAppointmentRepo {
    
    // todo: check how i can utilise the type through constructor
        // -- idk whether in the real project we will use the constructor here or not --
        // -- may be it will be just save --

    // private String type;

    // public BadAppointmentRepo(String type) {
    //     this.type = type;
    // }

    // public String getType() {
    //     return type;
    // }

    // public void setType(String type) {
    //     this.type = type;
    // }

    public void save(String type) {
        System.out.println(" ******** Saved "+ type+ " to the database ************* ");
    }
    
}
