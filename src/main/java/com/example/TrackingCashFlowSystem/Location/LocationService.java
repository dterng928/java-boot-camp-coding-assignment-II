package com.example.TrackingCashFlowSystem.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

//    public Location queryLocationById(Integer id) {
//        return locationRepository.findById(id).get();
//    }

    public Boolean saveLocation(Location location) {
        try{
            locationRepository.save(location);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
