package org.evavdb1.shoepair;

public class ShoePairMain {
    public static void main(String[] args) {

        ShoePair nike = new ShoePair("Nike", false, "white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand", true, "brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga", true, "black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike", true, "white", 42, 29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand", true, "black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga", false, "black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike", true, "white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand", true, "yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga", false, "black", 37, 349.99);

        ShoePair[] shoePairs = {nike, timberLand, balenciaga, nike2, timberLand2, balenciaga2, nike3, timberLand3, balenciaga3};

        // test print 1 object
        System.out.println(nike3);

        System.out.println();
        // print completes, size 41
        ShoePair.mySelection(shoePairs);

        System.out.println();
        // print missing shoes en money lost
        ShoePair.countLoss(shoePairs);

    }
}
/* given fields, given objects made.
print all complete pairs, size 41.
count how many pairs incomplete.
calculate money lost because of incomplete pairs.
*/