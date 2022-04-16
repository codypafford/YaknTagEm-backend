package com.yakking.yak.models;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Location {

    @Id
    private String id;

    private String name;

    private String latitude;
    private String longitude;

    private List<String> tags;

    private int rating;

    public Location() {

    }

    public Location(String name, String latitude, String longitude, List<String> tags,
            int rating) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Location [rating=" + rating + ", id=" + id + ", latitude=" + latitude + ", longitude="
                + longitude + ", name=" + name + ", tags=" + tags + "]";
    }

}
