package com.company.less8;

public abstract class Figure {

    float x;
    float y;
    float z;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Figure(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public abstract float getPerimeter();

    public abstract float getArea();
}
