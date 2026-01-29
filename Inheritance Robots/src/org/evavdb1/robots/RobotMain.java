package org.evavdb1.robots;
public class RobotMain {
    public static void main(String[] args) {

        System.out.println("--Bending--");
        BendingRobot robot02 = new BendingRobot("C1PO",90);
        System.out.println(robot02);
        robot02.bend(90);
        BendingRobot robot03 = new BendingRobot("C2PO", 380);
        System.out.println(robot03);
        robot03.bend(380);
        BendingRobot robot08 = new BendingRobot("C7PO", 222);
        System.out.println(robot08);
        robot08.bend(222);

        System.out.println("--lifting--");
        LiftingRobot robot04 = new LiftingRobot("C4PO", 3.50);
        System.out.println(robot04);
        robot04.lift(2);
        LiftingRobot robot05 = new LiftingRobot("C5PO", 7.00);
        System.out.println(robot05);
        robot05.lift(9);

        System.out.println("--that's nuts--");
        CrazyRobot robot06 = new CrazyRobot("C6PO");
        CrazyRobot robot07 = new CrazyRobot("tacocat");

    }
}
