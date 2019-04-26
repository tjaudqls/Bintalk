package com.example.trigem.test.model;

import java.util.HashMap;
import java.util.Map;

public class GpsModel {
    double Long;
    double Lat;

    /*public Map<String, Gps> gpsHashMap = new HashMap<>(); //gps 내용

    public static class Gps{
        public double longitude;
        public double latitude;
    }*/



    public void setLong(double Long){
        this.Long = Long;
    }
    public void setLat(double Lat){
        this.Lat = Lat;
    }
    public double getLong(){
        return Long;
    }
    public double getLat(){
        return  Lat;
    }
}
