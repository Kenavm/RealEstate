package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        RealEstate realEstate = new Flat("wiedner hauptstraße", 800.00, 62, 4);

        realEstate.changePrice(1000.0);
        realEstate.changePrice(10);
        // System.out.println(realEstate);
        //System.out.println(realEstate.getPrice());
        House house = new House("house1", 5000, 300, true);
        //System.out.println(house);
        Flat flat = new Flat("flat1", 1200, 100, 4);

        //System.out.println(flat);

        List<RealEstate> realEstates = new ArrayList<RealEstate>();
        realEstates.add(flat);
        realEstates.add(house);

        for (RealEstate realsEstate : realEstates
        ) {
            System.out.println(realsEstate);
        }
    }
}
