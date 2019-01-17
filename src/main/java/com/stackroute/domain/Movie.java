package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    Actor actor;
    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }
    //setter based dependency injection
//    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
