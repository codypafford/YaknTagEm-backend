package com.yakking.yak.services;

import java.util.ArrayList;
import java.util.List;

import com.yakking.yak.models.Comments;
import com.yakking.yak.models.Location;
import com.yakking.yak.repos.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServices {

    @Autowired
    private LocationRepository locationRepo;

    public Location getLocationById(String id) throws Exception {
        return locationRepo.findById(id).orElseThrow((() -> new Exception("Get Location: Location does not exist")));
    }

    public Location createLocation(Location locDetails) {
        Location location = new Location();
        location.setName(locDetails.getName());
        location.setLatitude(locDetails.getLatitude());
        location.setLongitude(locDetails.getLongitude());
        location.setTags(locDetails.getTags());
        location.setDifficulty(locDetails.getDifficulty());

        return locationRepo.save(location);
    }

    public Location updateLocationTags(String id, List<String> newTags) throws Exception {
        Location loc = locationRepo.findById(id)
                .orElseThrow((() -> new Exception("Update Location: Location does not exist")));

        List<String> originalTags = loc.getTags();
        originalTags.addAll(newTags);

        loc.setTags(originalTags);
        System.out.println("The new location details: ");
        System.out.println(loc);
        return locationRepo.save(loc);
    }

    // public Location updateLocationPhotos(String id, PhotoObj photo) throws
    // Exception {
    // Location loc = locationRepo.findById(id)
    // .orElseThrow((() -> new Exception("Update Location: Location does not
    // exist")));
    // ArrayList<PhotoObj> existingPhotos = loc.getPhotos();

    // // TODO : Research if there is a way to 'update' without re-setting the
    // entire
    // // photos field
    // existingPhotos.add(photo);
    // loc.setPhotos(existingPhotos);

    // return locationRepo.save(loc);
    // }

    public List<Location> getLocations() {
        return locationRepo.findAll();
    }

}
