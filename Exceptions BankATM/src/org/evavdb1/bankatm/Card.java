package org.evavdb1.bankatm;

public class Card {
    private String cardNumber;
    private boolean isValid;
    private int attempts;

    public Card(String cardNumber, boolean isValid, int attempts) {
        this.cardNumber = cardNumber;
        this.isValid = isValid;
        this.attempts = attempts;
    }

    public int getAttempts() {        return attempts;    }
    public String getCardNumber() {        return cardNumber;    }

    public boolean validate() {
        return isValid;
    }

    public void incrementAttempts() {
        attempts++;
    }

    public void resetAttempts() {
        attempts = 0;
    }
}
