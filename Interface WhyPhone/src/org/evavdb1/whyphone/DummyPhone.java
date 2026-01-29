package org.evavdb1.whyphone;

public class DummyPhone implements ISimCard, IRadio {

    private final double PRICE;
    private final String BRAND;

    public DummyPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }


    @Override
    public void playChannel(double fm) {
        System.out.println("RADIO - scanning bandwidth for "+fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("RADIO - changing channel to "+fm+" fm");
    }

    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }

    public String toString() {
        return "The "+BRAND+" for $"+PRICE+".";
    }
}
