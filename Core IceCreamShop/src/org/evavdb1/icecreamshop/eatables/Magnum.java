package org.evavdb1.icecreamshop.eatables;

public class Magnum implements Eatable {

    private final MagnumType type;


    public Magnum(MagnumType type) {
        this.type = type;
    }


    @Override
    public void eat() {
        System.out.println("You have a " + type.name() + " Magnum. Enjoy!");
    }

    public MagnumType getType() {
        return type;
    }
}
