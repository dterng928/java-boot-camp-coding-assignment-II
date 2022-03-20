package com.example.TrackingCashFlowSystem.Location;

import com.example.TrackingCashFlowSystem.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

//    @GetMapping("/location/{id}")
//    public Location getLocationById(@PathVariable Integer id) {
//        return locationService.queryLocationById(id);
//    }

    @PostMapping("/location")
    public LocationResponse updateLocation(@RequestBody Location location) {
        if(locationService.saveLocation(location)){
            return new LocationResponse(ResponseStatus.SUCCESS.getStatus());
        }
        return new LocationResponse(ResponseStatus.FAIL.getStatus());
    }
}
