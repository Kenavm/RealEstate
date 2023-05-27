package com.codecool;

public class House extends RealEstate {

    private boolean hasGarden;

    public House(String address, double price, int area, boolean hasGarden) {
        super(address, price, area);
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "address "+ address+ " price "+ price+ " area "+area +" "+(hasGarden ? "there is a garden": "no garden");
    }
}
