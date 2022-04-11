package com.yakking.yak.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Comments {

    @Id
    private ObjectId id;

    private String text;

    public Comments() {
        this.id = new ObjectId();
    }

    public Comments(String text) {
        this.id = new ObjectId();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

}
