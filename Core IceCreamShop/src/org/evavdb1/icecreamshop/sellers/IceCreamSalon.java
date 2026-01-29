package org.evavdb1.icecreamshop.sellers;
import org.evavdb1.icecreamshop.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    private final PriceList priceList;
    private double totalProfit = 0;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
            }


    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        totalProfit += (flavors.length * priceList.getBallPrice());
        return new Cone(flavors);
            }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
            }

    @Override
    public Magnum orderMagnum(MagnumType type) {
       totalProfit += priceList.getMagnumPrice(type);
       return new Magnum(type);
    }

    @Override
    public String toString() {
        return "IceCreamSalon: the total profit is €" + totalProfit;
    }
}
