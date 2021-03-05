package ru.frozenpriest.shared;

import java.io.Serializable;

/**
 * Song POJO class
 */

public class Song implements Serializable {
    public String name, author;
    public int listenTime, duration;

    public Song(String name, String author, int listenTime, int duration) {
        this.name = name;
        this.author = author;
        this.listenTime = listenTime;
        this.duration = duration;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getListenTime() {
        return listenTime;
    }

    public void setListenTime(int listenTime) {
        this.listenTime = listenTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
