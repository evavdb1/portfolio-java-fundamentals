package org.evavdb1.shoepair;
public class ShoePair {

    private String brand;
    private boolean complete;
    private String colour;
    private int size;
    private double price;

    public ShoePair(String brand, boolean complete, String colour, int size, double price) {
        this.brand = brand;
        this.complete = complete;
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public boolean isComplete() { return complete; }
    public int getSize() { return size; }
    public double getPrice() { return price; }

    public static void mySelection(ShoePair[] shoePairs) {
        System.out.println("Shoes that are size 41 and complete: ");
        for (ShoePair mySize : shoePairs) {
            if (mySize.getSize() == 41 && mySize.isComplete()) {
                System.out.println(mySize);
            }
        }
    }

    public static void countLoss(ShoePair[] shoePairs) {
        int halfPair = 0;
        double sum = 0;
        double endsum = 0;
        for (ShoePair mySize : shoePairs) {
            if (!mySize.isComplete()) {
                halfPair++;
                sum += mySize.getPrice();
                endsum = sum/2;
            }
        }
            System.out.println("Number of incomplete pairs: "+halfPair);
            System.out.println("Losing those shoes means you lost: $"+sum+".");
            System.out.println("Technically, you lost: $"+endsum+".");
        }

    @Override
    public String toString() {
        return "The "+colour+" "+brand+"s for $"+price+".";
    }
}
