package com.yakking.yak.repos;

import com.yakking.yak.models.Location;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {

    public Location findByName(String name);

}
