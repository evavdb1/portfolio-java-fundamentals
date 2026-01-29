package org.evavdb1.icecreamshop;
import org.evavdb1.icecreamshop.eatables.Eatable;
import org.evavdb1.icecreamshop.eatables.Flavor;
import org.evavdb1.icecreamshop.eatables.MagnumType;
import org.evavdb1.icecreamshop.exception.NoMoreIceCreamException;
import org.evavdb1.icecreamshop.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {
        System.out.println();

        PriceList list01 = new PriceList(1.0,1.5,2.0 );
        IceCreamSeller seller01 = new IceCreamSalon(list01);

        Eatable[] frozen01 = new Eatable[] {
                seller01.orderCone(new Flavor[]{Flavor.BANANA, Flavor.MOKA, Flavor.STRAWBERRY}),
                seller01.orderIceRocket(),
                seller01.orderMagnum(MagnumType.MILK_CHOCOLATE),
                seller01.orderMagnum(MagnumType.WHITE_CHOCOLATE),
                seller01.orderMagnum(MagnumType.BLACK_CHOCOLATE)
        };

        for (Eatable x : frozen01) {
            x.eat();
        }
        System.out.println();
        System.out.println(seller01);
        System.out.println("\n               *************************");

        PriceList list02 = new PriceList(1.5, 2.0, 3.0);
        Stock stockCar02 = new Stock(1, 50, 150, 50);
        IceCreamSeller seller02 = new IceCreamCar(list02, stockCar02);
        Eatable[] frozen02 = new Eatable[4];

        int i = 0;
        try {
             frozen02[i] = seller02.orderCone(new Flavor[]{Flavor.BANANA, Flavor.MOKA, Flavor.STRAWBERRY});
             i++;
        } catch (NoMoreIceCreamException e) {
            System.out.println(e.getMessage());
        }

        try {
            frozen02[i] = seller02.orderIceRocket();
            i++;
        } catch (NoMoreIceCreamException e) {
            System.out.println(e.getMessage());
        }

        try {
            frozen02[i] = seller02.orderIceRocket();
            i++;
        } catch (NoMoreIceCreamException e) {
            System.out.println(e.getMessage());
        }

        try {
            frozen02[i] = seller02.orderMagnum(MagnumType.ROMANTIC_STRAWBERRIES);
            i++;
        } catch (NoMoreIceCreamException e) {
            System.out.println(e.getMessage());
        }


        for (int k = 0; k < i; k++) {
            frozen02[k].eat();
        }

        System.out.println();
        System.out.println(seller02.getProfit());
    }
}
