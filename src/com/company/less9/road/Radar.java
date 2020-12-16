package com.company.less9.road;

public class Radar {

    private int maxSpeed;
    private final HighSpeedListener policeOffice;

    public Radar(HighSpeedListener policeOffice) {
        this.policeOffice = policeOffice;
    }

    public void checkCarSpeed(Car car) {
        if (car.getCurrentSpeed() > maxSpeed) {
            sendFine(car.getPlateNumber(), car.getCurrentSpeed() - maxSpeed);
        }
    }

    private void sendFine(String plateNumber, int speedDiff) {
        policeOffice.calculateFineAndSend(plateNumber, speedDiff);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
