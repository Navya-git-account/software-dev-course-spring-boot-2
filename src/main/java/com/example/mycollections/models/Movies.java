package com.example.mycollections.models;

public class Movies extends LibraryItem {
    private String Director;
    private int Runtime;

    public Movies (String name, String Director, int year, int Runtime) {
        super(name, year);
        this.Director = Director;
        this.Runtime = Runtime;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getRuntime() {
        return Runtime;
    }

    public void setRuntime(int Runtime) {
        this.Runtime = Runtime;
    }

    @Override
    public String toString() {
        return name + " by " + Director;
    }
}
