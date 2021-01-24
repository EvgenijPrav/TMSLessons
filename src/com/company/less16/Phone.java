package com.company.less16;

import java.util.Comparator;

public class Phone implements Comparable<Phone> {
    private String name;
    private String manufacturer;
    private int cost;

    public Phone(String name, String manufacturer, int cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        return this.getName().compareTo(o.getName());
    }
}

class NameComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }
}

class ManufacturerComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getManufacturer().toLowerCase().compareTo(o2.getManufacturer().toLowerCase());
    }
}

class CostComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o2.getCost().compareTo(o1.getCost());
    }
}
