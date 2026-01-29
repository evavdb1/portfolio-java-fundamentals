package org.evavdb1.forestnotebook.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leaftype;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height, String fruit, LeafType leaftype) {
        super(name, height);
        this.fruit = fruit;
        this.leaftype =leaftype;
    }

    public String getFruit() {        return fruit;    }
    public void setFruit(String fruit) {        this.fruit = fruit;    }
    public LeafType getLeaftype() {        return leaftype;    }
    public void setLeaftype(LeafType leaftype) {        this.leaftype = leaftype;    }

    @Override
    public String toString() {
        return getName() + ", " + super.getHeight() + " m high, this bush carries " + fruit + " and has " + leaftype + "-shaped leaves";
    }
}
