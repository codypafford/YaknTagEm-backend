package com.yakking.yak.controllers;

import java.util.List;

import com.yakking.yak.models.Location;
import com.yakking.yak.services.LocationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private LocationServices locationServices;

    @CrossOrigin(origins = "*")
    @GetMapping("/api/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/api/create-location")
    public Location createLocation(@RequestBody Location location) {
        return locationServices.createLocation(location);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/api/update-location-tags")
    public Location updateLocationTags(@RequestBody Location location) throws Exception {
        System.out.println("recieved id: " + location.getId());
        System.out.println("recieved tags: " + location.getTags());
        return locationServices.updateLocationTags(location.getId(), location.getTags());
    }

    // @PostMapping("/api/update-location")
    // public Location updateLocationComments(@RequestBody Location location) throws
    // Exception {
    // String id = location.getId();
    // return locationServices.updateLocationComments(id, location);
    // }

    @CrossOrigin(origins = "*")
    @GetMapping("/api/locations")
    public List<Location> getAllLocations() {
        return locationServices.getLocations();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/api/get-location-by-id/{id}")
    public Location getLocationById(@PathVariable String id) throws Exception {
        System.out.println("recieved id in getLocationById: " + id);
        return locationServices.getLocationById(id);
    }

}