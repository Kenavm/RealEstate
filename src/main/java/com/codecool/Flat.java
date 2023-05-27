package com.codecool;

public class Flat extends RealEstate {

    protected int floor;
    public Flat(String address, double price, int area, int floor) {
        super(address, price, area);
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString()+ " floor: "+floor;
    }
}
