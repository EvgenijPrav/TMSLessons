package com.company.less8;

public class Rectangle extends Figure{

    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public float getArea() {
        return  width * height;
    }
}
