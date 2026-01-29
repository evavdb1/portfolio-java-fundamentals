package org.evavdb1.casino;

public class CasinoMain {
    public static void main(String[] args) {

    // create person with name and wallet.
        Gambler person01 = new Gambler("Manfred", 1900);
        Gambler person02 = new Gambler("Janice", 1400);
        Gambler person03 = new Gambler("Cindy", 300);

    // play Roulette.

        Roulette roulette01 = new Roulette(0,0);
        Roulette roulette02 = new Roulette(4, 0);
        Roulette roulette03 = new Roulette(0, 800);

        roulette01.play(person01);
        roulette02.play(person02);
        roulette03.play(person03);

    }
}
