package com.revature.fixme;

public interface OfficeJobs {

    void printMe(String message);

    String allCaps(String message);

    double[] orderBySize(double[] moneyOrders);

    Email makeEmail(String authorEmail, String recipientEmail, String message);
}
