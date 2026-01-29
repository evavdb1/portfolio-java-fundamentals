package org.evavdb1.robots;
public class CrazyRobot extends Robot {


    public CrazyRobot(String unitName) {
        super(unitName);
    }
    public CrazyRobot() {
        super();
    }


@Override
    public void boot() {
        System.out.println("Crazy Robot warming up...");
        if( getUnitName() != null) { //nullpointerexcep
            setUnitName(new StringBuilder(getUnitName()).reverse().toString());
            System.out.println("The robot decided on this name: "+getUnitName());
        }
    }

@Override
    public String toString() {
        return "Another crazy robot called: "+getUnitName();
    }
}
