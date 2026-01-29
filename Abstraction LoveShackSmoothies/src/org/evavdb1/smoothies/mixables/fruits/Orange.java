package org.evavdb1.smoothies.mixables.fruits;
public class Orange extends Fruit {

    public Orange(double pricePerPiece) {
        super(1);
    }

    @Override
    public void mix() {
        System.out.println("mix- Orange is pressed and added");
    }

}
