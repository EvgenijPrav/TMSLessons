package com.company.less6;

public class PhoneNumber {

    private String countryCode;
    private String operatorCode;
    private String number;

    public PhoneNumber(String countryCode, String operatorCode, String number) {
        this.countryCode = countryCode;
        this.operatorCode = operatorCode;
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public String getNumber() {
        return number;
    }
}
