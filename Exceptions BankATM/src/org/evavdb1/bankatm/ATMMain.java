package org.evavdb1.bankatm;

import java.util.Arrays;

public class ATMMain {
    public static void main(String[] args) throws CashUnavailableException, InsufficientFundsException, PinAttemptExceededException, InvalidCardException, InvalidPinException, DailyLimitExceededException {

        ATM atm99 = new ATM("Rouppeplein", 1000);
        ATM atm98 = new ATM("Anseeleplein", 0);

            Card card01 = new Card("987654321", true, 0);
            Card card05 = new Card("918273645", true, 3);
            Account account01 = new Account("BE00000000001212", 666, 500);
        BankCustomer customer01 = new BankCustomer("Monay", Arrays.asList(account01), card01);
        BankCustomer customer05 = new BankCustomer("Monay", Arrays.asList(account01), card05);

            Card card02 = new Card("123456789", true, 0);
            Account account02 = new Account("BE00000000000555", 100, 1000);
        BankCustomer customer02 = new BankCustomer("Richard", Arrays.asList(account02), card02);

            Card card03 = new Card("864213579", true, 0);
            Account account03 = new Account("BE00000000000001", 1000, 200);
        BankCustomer customer03 = new BankCustomer("Jimmy", Arrays.asList(account03), card03);

            Card card04 = new Card("975318642", false, 0);
            Account account04 = new Account("BE00000000000555", 100, 1000);
        BankCustomer customer04 = new BankCustomer("Cindy", Arrays.asList(account04), card04);

        String pin = "1234";

        // all fine
        try {
            System.out.println("\n--- transaction 1 ---");
            atm99.ATMUse(customer01,pin, 100);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

        // no cash in atm
        try {
            System.out.println("\n--- transaction 2 ---");
            atm98.ATMUse(customer02,pin, 100);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                 | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

        // daily limit exceeded
        try {
            System.out.println("\n--- transaction 3 ---");
            atm99.ATMUse(customer03,pin, 300);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                 | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

        // not enough on account
        try {
            System.out.println("\n--- transaction 4 ---");
            atm99.ATMUse(customer02,pin, 300);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                 | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

        // card not valid
        try {
            System.out.println("\n--- transaction 5 ---");
            atm99.ATMUse(customer04,pin, 100);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                 | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

        // pin not valid
        try {
            System.out.println("\n--- transaction 6 ---");
            atm99.ATMUse(customer03,"9876", 300);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                 | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

        // too many wrong pin attempts
        try {
            System.out.println("\n--- transaction 7 ---");
            atm99.ATMUse(customer05,"8888", 100);
        } catch (InvalidCardException | InvalidPinException | PinAttemptExceededException | InsufficientFundsException
                 | DailyLimitExceededException | CashUnavailableException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: "+e.getMessage());
        }

    }
}
