package com.factoryEHR.factoryEHR.good.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AppointmentFactory {
    // The controller going to call this factory to get the correct service object to do the job.


    private final Map<String, AppointmentService> serviceMap;
    
    public AppointmentFactory(Map<String, AppointmentService> serviceMap) {
        this.serviceMap = serviceMap;
    }

    public AppointmentService getService(String type) {
        // now spring has the service objects
        // we have many services, so use map ds to store the service, the key will be the service name
        // so it will be easier to get the correct service type

        AppointmentService service = serviceMap.get(type);

        return service;
    }
}
