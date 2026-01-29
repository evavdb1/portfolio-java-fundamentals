package org.evavdb1.icecreamshop.eatables;
import java.util.Arrays;

public class Cone implements Eatable {

    private final Flavor[] balls;

    public Cone(Flavor[] balls) {        this.balls = balls;    }


    @Override
    public void eat() {
        System.out.println("You have one ice cream cone with flavor(s): "+ Arrays.toString(balls) +". Enjoy!");
    }
}
