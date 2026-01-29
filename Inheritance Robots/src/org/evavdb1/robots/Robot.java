package org.evavdb1.robots;
public class Robot {

    private String unitName;

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
    }
    public Robot() {
        setUnitName("Nameless Robot");
        boot();
        System.out.println("Robot name: "+getUnitName());
    }

    public String getUnitName() {        return unitName;    }
    public void setUnitName(String unitName) {        this.unitName = unitName;    }


    public void boot() {
        System.out.println("Robot warming up...");
    }
}
