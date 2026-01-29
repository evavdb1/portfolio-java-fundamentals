package org.evavdb1.whyphone;

public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi {

    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;

    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    public double getPRICE() {        return PRICE;    }
    public String getBRAND() {        return BRAND;    }


    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println("ICAMERA - * click click * "+(int)amountOfPhotos+" times");
    }

    @Override
    public String[] viewPhotos() {
        numberOfPhotos = 10;
        System.out.println("ICAMERA - ...browsing through the photos...");
        String[] album = new String[numberOfPhotos];
        return album;
    }

    @Override
    public String locate(double longitude, double latitude) {
        System.out.println("IGPS - You are here: "+longitude+"° N, "+latitude+"° E.");
        return "location";
    }

    @Override
    public void navigate() {
        System.out.println("IGPS - navigating to your next adventure");
    }

    @Override
    public void playChannel(double fm) {
        System.out.println("IRADIO - playing "+fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("IRADIO - changing channel to "+fm+" fm");
    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("IWIFI - connecting to the neighbour's wifi: "+internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("IWIFI - disconnecting from the neighbour's wifi: "+internetConnection);
    }

    public String toString() {
        return "The "+getBRAND()+" for $"+getPRICE()+".";
    }
}
