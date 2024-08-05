package com.mydomain.design;

public class Aeroplane {

    private String companyName;
    private  String type;
    private  int schedule;
    private int size;
    private int flightAttendence;
    private String purpose;
    private String manufacturer;

    private int numberSeats;

    public Aeroplane(String companyName, String type, int schedule, int size, int flightAttendence, String purpose, String manufacturer, int numberSeats) {
        this.companyName = companyName;
        this.type = type;
        this.schedule = schedule;
        this.size = size;
        this.flightAttendence = flightAttendence;
        this.purpose = purpose;
        this.manufacturer = manufacturer;
        this.numberSeats = numberSeats;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFlightAttendence() {
        return flightAttendence;
    }

    public void setFlightAttendence(int flightAttendence) {
        this.flightAttendence = flightAttendence;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
}
