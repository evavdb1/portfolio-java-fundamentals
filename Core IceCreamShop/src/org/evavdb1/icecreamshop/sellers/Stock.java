package org.evavdb1.icecreamshop.sellers;

public class Stock {

    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    public int getIceRockets() {        return iceRockets;    }
    public void setIceRockets() {        iceRockets--;    }

    public int getCones() {        return cones;    }
    public void setCones() {        cones--;    }

    public int getBalls() {        return balls;    }
    public void setBalls(int length) {       balls -= length;    }

    public int getMagni() {        return magni;    }
    public void setMagni() {        magni--;    }

}
