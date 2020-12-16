package com.company.less9.road;

public class PoliceOffice implements HighSpeedListener {

    private final int fineAlpha = 15;

    @Override
    public void calculateFineAndSend(String plateNumber, int speedDiff) {
        System.out.println("Car with plate " + plateNumber + " is fined for high speed (" + speedDiff + "), fine: " + speedDiff * fineAlpha);
    }
}
