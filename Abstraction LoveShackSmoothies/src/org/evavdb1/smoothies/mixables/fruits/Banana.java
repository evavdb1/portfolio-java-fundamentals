package org.evavdb1.smoothies.mixables.fruits;
public class Banana extends Fruit {

    public Banana(double pricePerPiece) {
        super(1.25);
    }

    @Override
    public void mix() {
        System.out.println("mix- Banana is mashed and added");
    }

}
