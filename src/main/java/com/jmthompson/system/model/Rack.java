package com.jmthompson.system.model;

import java.util.Objects;

public class Rack {
    private int number;
    private String locationIdentifier;

    public Rack() {
    }

    public Rack(int number, String locationIdentifier) {
        this.number = number;
        this.locationIdentifier = locationIdentifier;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    public void setLocationIdentifier(String locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rack rack = (Rack) o;
        return getNumber() == rack.getNumber() && getLocationIdentifier().equals(rack.getLocationIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getLocationIdentifier());
    }

    @Override
    public String toString() {
        return "Rack{" +
                "number=" + number +
                ", locationIdentifier='" + locationIdentifier + '\'' +
                '}';
    }
}
