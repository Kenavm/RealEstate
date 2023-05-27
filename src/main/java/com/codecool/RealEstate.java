package com.codecool;

public abstract class RealEstate {

    protected String address;
    protected double price;
    protected int area;

    public RealEstate(String address, double price, int area) {
        this.address = address;
        this.price = price;
        this.area = area;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changePrice(int percent) {
        this.price = this.price*(1+(percent/100.0));
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "address='" + address + '\'' +
                ", price=" + price + " €"+
                ", area=" + area +
                '}';
    }
}
