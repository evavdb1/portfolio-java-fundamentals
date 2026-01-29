package org.evavdb1.robots;
public class LiftingRobot extends Robot {

    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public double getMaxLiftHeight() {        return maxLiftHeight;    }


    public void lift (double height) {
        if (height < getMaxLiftHeight()) {
            System.out.printf("lifting %.2fm successful!",height);
            System.out.println();
        } else {
            System.out.println("lift unsuccessful. Reason: too high");
        }
    }

@Override
    public String toString() {
        return "Another lifting robot, called: "+getUnitName()+", lifting to max "+maxLiftHeight+"m";
    }
}
