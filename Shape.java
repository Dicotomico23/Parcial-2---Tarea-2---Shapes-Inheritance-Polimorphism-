package oop.parcial2;

import java.awt.*;

public abstract class Shape {
    private String name;
    protected Shape(String name){this.name = name;}
    public String getName(){return name;}
    public abstract double getPerimeter();
    public abstract int getSidesCount();
    public abstract double getArea();
}
