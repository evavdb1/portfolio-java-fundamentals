package org.evavdb1.forestnotebook.entities.plant_entities;

public class Tree extends Plant {

    private LeafType leaftype;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height, LeafType leaftype) {
        super(name, height);
        this.leaftype = leaftype;
    }

    public LeafType getLeaftype() {        return leaftype;    }
    public void setLeaftype(LeafType leaftype) {        this.leaftype = leaftype;    }

    @Override
    public String toString() {
        return getName() + ", "+ super.getHeight() + " m high, this tree has " + leaftype.toString().toLowerCase() + "-shaped leaves";
    }
}
