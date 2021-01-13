package com.company.less11;

public class Coin {

    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) throws CoinLogicException {
        if (diameter <= 0) {
            throw new CoinLogicException("Diameter is incorrect");
        }
        this.diameter = diameter;
    }

    public String getString() throws CoinLogicException {
        throw new CoinLogicException();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
