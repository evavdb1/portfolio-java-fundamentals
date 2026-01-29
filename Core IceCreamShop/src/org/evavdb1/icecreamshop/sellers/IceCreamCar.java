package org.evavdb1.icecreamshop.sellers;
import org.evavdb1.icecreamshop.exception.NoMoreIceCreamException;
import org.evavdb1.icecreamshop.eatables.*;


public class IceCreamCar implements IceCreamSeller{

    private final PriceList priceList;
    private final Stock stock;
    private double profit = 0;


    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }


    @Override
    public Cone orderCone(Flavor[] flavors) throws NoMoreIceCreamException {
        return prepareCone(flavors);
    }

    private Cone prepareCone(Flavor[] flavors) throws NoMoreIceCreamException {
        if (stock.getCones() <= 0 || stock.getBalls() < flavors.length) {
            throw new NoMoreIceCreamException("No balls, no cones, sorry.");
        }
        stock.setCones();
        stock.setBalls(flavors.length);
        profit += priceList.getBallPrice() * flavors.length;
        return new Cone(flavors);
    }


    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        return prepareRocket();
    }

    private IceRocket prepareRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() <= 0) {
            throw new NoMoreIceCreamException("IceRockets are now sold out, sorry.");
        }
        stock.setIceRockets();
        profit += priceList.getRocketPrice();
        return new IceRocket();
    }


    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
        return prepareMagnum(type);
    }

    private Magnum prepareMagnum(MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagni() <= 0) {
            throw new NoMoreIceCreamException("Magnums all gone, sorry.");
        }
        stock.setMagni();
        profit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }


    @Override
    public double getProfit() {
        System.out.print("IceCreamCar: total profit is €");
        return profit;
    }
}
