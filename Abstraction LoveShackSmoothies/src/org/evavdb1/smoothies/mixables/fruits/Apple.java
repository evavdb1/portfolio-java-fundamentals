package org.evavdb1.smoothies.mixables.fruits;
public class Apple extends Fruit {

    public Apple(double pricePerPiece) {
        super(0.5);
    }

    @Override
    public void mix() {
        System.out.println("mix- Apple is mashed and added");
    }

}
