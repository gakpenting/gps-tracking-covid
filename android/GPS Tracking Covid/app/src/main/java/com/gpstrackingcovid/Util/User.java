package com.gpstrackingcovid.Util;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.Date;

@IgnoreExtraProperties
public class User implements Serializable {

    public double lat;
    public String id;
    public double longi;
    public double altitude;
    public String online;
    public String user;
    public int distance=0;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public double getLat() {
        return lat;
    }

    public double getLongi() {
        return longi;
    }

    public String getOnline() {
        return online;
    }


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String id,String user, double lat, double longi, double altitude, String online) {
        this.id = id;
        this.user = user;
        this.lat = lat;
        this.longi= longi;
        this.altitude= altitude;
        this.online = online;
    }

    public User(String id,String user, double lat, double longi, double altitude, String online,int distance) {
        this.id = id;
        this.user = user;
        this.lat = lat;
        this.longi= longi;
        this.altitude= altitude;
        this.online = online;
        this.distance =distance;
    }

}
