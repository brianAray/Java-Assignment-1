package com.revature.fixme;

public class Office implements OfficeJobs {

    public Office(){}

    @Override
    public void printMe(String message) {
        // I need to print out the message using the BrokenPrinter
        BrokenPrinter brokenPrinter = new BrokenPrinter();

        // Fix the method for the brokenPrinter to save the message sent to it
        brokenPrinter.sendToPrinter("I AM BROKEN");
    }

    @Override
    public String allCaps(String message) {
        // I need to turn the message into all capital letters
        return message;
    }

    @Override
    public double[] orderBySize(double[] moneyOrders) {
        // I need to order these by their size using control flow
        return new double[0];
    }

    @Override
    public Email makeEmail(String authorEmail, String recipientEmail, String message) {
        // I need to return an email object with the right fields
        return null;
    }
}
