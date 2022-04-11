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

    private int difficulty;

    public Location() {

    }

    public Location(String name, String latitude, String longitude, List<String> tags,
            int difficulty) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
        this.difficulty = difficulty;
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

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Location [difficulty=" + difficulty + ", id=" + id + ", latitude=" + latitude + ", longitude="
                + longitude + ", name=" + name + ", tags=" + tags + "]";
    }

}
