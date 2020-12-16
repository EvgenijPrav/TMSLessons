package com.company.less9;

public enum Color {
    RED("1", 10),
    BLUE("#0000FF", 20),
    GREEN("#00FF00", 30);

    private final int count;
    private final String colorHex;

    Color(String colorHex, int count) {
        this.colorHex = colorHex;
        this.count = count;
    }

    public String getColorHex() {
        return colorHex;
    }

    public int getCount() {
        return count;
    }
}
