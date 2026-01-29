package org.evavdb1.smoothies.mixables.vegetables;
public class Celery extends Vegetable{

    public Celery(double pricePerPiece) {
        super(1);
    }

    @Override
    public void mix() {
        System.out.println("mix- Celery is cut and added");
    }

}
