package com.passionproject.thulasipuppala.schoolbusproject;

public class BusLocation {

    private BusLocation location;
    private double latitude;
    private double longitude;

    private BusLocation() {

    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public static BusLocation getBusLocation(){
        return new BusLocation();
    }
}
