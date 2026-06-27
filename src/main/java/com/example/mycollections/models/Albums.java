package com.example.mycollections.models;

public class Albums extends LibraryItem {
    private String Artist;
    private int Tracks;

    public Albums(String name, String Artist, int year, int Tracks) {
        super(name, year);
        this.Artist = Artist;
        this.Tracks = Tracks;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public int getTracks() {
        return Tracks;
    }

    public void setTracks(int Tracks) {
        this.Tracks = Tracks;
    }

    @Override
    public String toString() {
        return name + " by " + Artist;
    }
}
