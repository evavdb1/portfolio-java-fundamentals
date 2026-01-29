package org.evavdb1.smoothies.mixables.fruits;
public class Strawberry extends Fruit{

    public Strawberry(double pricePerPiece) {
        super(2);
    }

    @Override
    public void mix() {
        System.out.println("mix- Strawberry is mashed and added");
    }

}
