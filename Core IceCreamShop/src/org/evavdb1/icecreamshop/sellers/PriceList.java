package org.evavdb1.icecreamshop.sellers;
import org.evavdb1.icecreamshop.eatables.MagnumType;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public void setBallPrice(double ballPrice) {        this.ballPrice = ballPrice;    }
    public void setRocketPrice(double rocketPrice) {        this.rocketPrice = rocketPrice;    }
    public void setMagnumStandardPrice(double magnumStandardPrice) {        this.magnumStandardPrice = magnumStandardPrice;    }

    public double getBallPrice() {        return ballPrice;    }
    public double getRocketPrice() {        return rocketPrice;    }

    public double getMagnumPrice(MagnumType type) {
        switch (type) {
            case ALPINE_NUTS:
                return magnumStandardPrice * 1.5;
            case ROMANTIC_STRAWBERRIES:
                return magnumStandardPrice * 1.75;
            default:
                return magnumStandardPrice;
        }
    }
}
