package org.evavdb1.smoothies.mixables;
public abstract class Food implements Mixable {

    double pricePerPiece;

    public Food(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public double getPricePerPiece() {        return pricePerPiece;    }

}
