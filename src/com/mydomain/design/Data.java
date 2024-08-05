package com.mydomain.design;

public class Data {
    private String genre;
    private String title;
    private String artist;
    private String producer;
    private int releaseYear;
    private String country;


    public Data(String genre, String title, String artist, String producer, int releaseYear, String country) {
        this.genre = genre;
        this.title = title;
        this.artist = artist;
        this.producer = producer;
        this.releaseYear = releaseYear;
        this.country = country;
    }
}
