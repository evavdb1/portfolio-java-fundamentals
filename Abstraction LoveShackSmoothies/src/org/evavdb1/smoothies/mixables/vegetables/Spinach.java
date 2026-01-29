package org.evavdb1.smoothies.mixables.vegetables;
public class Spinach extends Vegetable {

    public Spinach(double pricePerPiece) {
        super(1.25);
    }

    @Override
    public void mix() {
        System.out.println("mix- Spinach is mashed and added");
    }

}
