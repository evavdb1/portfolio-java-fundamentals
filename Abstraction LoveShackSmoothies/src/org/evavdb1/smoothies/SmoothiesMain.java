package org.evavdb1.smoothies;

import org.evavdb1.smoothies.shop.LoveShack;
import org.evavdb1.smoothies.shop.SmoothieRecipe;

public class SmoothiesMain {
    public static void main(String[] args) {
        System.out.println();

        LoveShack myOrder = new LoveShack(SmoothieRecipe.values());
        myOrder.order();

    }
}
