package org.evavdb1.casino;
import java.util.Random;

public class Roulette extends Casino {
    // fields
    private int amountOfTimesHouseLost;
    private int payout;
    private int winningNumber;

    private boolean guidedWin;

    // constructor
    public Roulette(int amountOfTimesHouseLost, int payout) {
        super();
        this.amountOfTimesHouseLost = amountOfTimesHouseLost;
        this.payout = payout;
    }

    // method to initiate the game, decide fraud or not and then play roulette
    @Override
    public void play(Gambler gambler) {
        System.out.println("            ---------------------------------------          ");
        System.out.println("\n   ♣️ Welcome at the ♥️ Roulette Table ♦️ one game is €200 ♠️ ");
        System.out.println(" ");
        System.out.println(gambler.getName() + " starts with €" + gambler.getWallet());
        System.out.println(" ");

        while (gambler.getWallet() >= 200 && gambler.getWallet() < 2000) {
            System.out.println("♣  ♠ starting a new round ♥  ♦");

            gambler.walletOut(200);

            shouldFailSafeBeUsed(13);

            rollTheRoulette(13, gambler);
        }
        if (gambler.getWallet() < 200) {
            System.out.println("\uD83E\uDEE4 " + gambler.getName() + " has no money left in the wallet.");
        } else {
            System.out.println(" \uD83D\uDC8E " + gambler.getName() + " has reached the max limit of €2000. Congratulations!");
        }
    }

    // method to check if the house has to always win (decide fraud is needed)
    private void shouldFailSafeBeUsed(int numberChosen) {
        guidedWin = amountOfTimesHouseLost >= 3 || payout >= 500;

        if (guidedWin) {
            System.out.println("m'kay \uD83D\uDE4A");
        } else {
            System.out.println("watching \uD83D\uDE48");
        }
    }

    // method to play the roulette and gambler wins/loses. unless the house doesn't want to.
    public void rollTheRoulette (int numberChosen, Gambler gambler) {
        Random numbers = new Random();
        winningNumber = numbers.nextInt(20) + 1;

        if (guidedWin && winningNumber == numberChosen) {
            do {
                winningNumber = numbers.nextInt(20) + 1;
            } while (winningNumber == numberChosen);
        }

        System.out.println("          \uD83C\uDFB2...rolling... \uD83C\uDFB2");
        System.out.println(" ");
        System.out.println("winning number \uD83C\uDF52 " + winningNumber + " \uD83C\uDF52");

        if (numberChosen == winningNumber) {
            System.out.println("Happy Days! " + gambler.getName() + " won €500 \uD83C\uDF4E\uD83C\uDF4F\uD83C\uDF4D.");
            System.out.println(" ");
            gambler.walletIn(500);
            System.out.println(" ");
            amountOfTimesHouseLost++;
            payout += 500;
        } else {
            System.out.println(gambler.getName() + " chose "+ numberChosen + ". FruitsNLosses!");
            System.out.println(" ");
        }
    }
}

/*
Level 4: Roulette( kost 200 EURO per keer)
In de shouldFailSafeBeUsed(int numberChosen) methode ga je kijken of dat het huis al meer dan 3 keer heeft verloren OF dat
de payout kleiner is dan 500. Als 1 van die twee condities waar zijn, dan blijf een nieuw random nummer trekken tussen 0 en 20
totdat de winningNumber niet hetzelfde is als de numberChosen. Zoniet moet je maar 1 keer die random trekken.
In de rollTheRoulette(int moneyPutIn, int numberChosen) methode kijk je nog eens na of de winningNumber overeenkomt met de numberChosen.
Als dit het geval is, krijgt de player 500 EURO.
*/