package org.evavdb1.robots;
public class BendingRobot extends Robot {

    private double angle;
    final double maxBendAngle = 360;

    public BendingRobot(String unitName, double angle) {
        super(unitName);
        this.angle = angle;
    }


    public void bend(double angle) {
        if (angle == 0) {
            System.out.println("Robot stays upright");
        } else if (angle > 180 && angle < 360) {
            double adjustedAngle = angle - 180;
            System.out.println("Luckily it's a robot. Bending backwards " +adjustedAngle+"° successful!");
        } else if (angle > 0 && angle <= 180) {
            System.out.println("bending at "+angle+"° successful!");
        } else {
            System.out.println("there's only 360° in a circle...");
        }
    }

@Override
    public String toString() {
        return "Another bending robot, called: "+getUnitName()+", bending at max: "+maxBendAngle+"°";
    }
}
