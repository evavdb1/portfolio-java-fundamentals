package org.evavdb1.smoothies.mixables.fruits;
public class Lemon extends Fruit {

    public Lemon(double pricePerPiece) {
        super(0.75);
    }

    @Override
    public void mix() {
        System.out.println("mix- Lemon is pressed and added");
    }

}
