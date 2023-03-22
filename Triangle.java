package oop.parcial2;

public class Triangle extends Shape{
    private int base, height;
    public Triangle(int base, int height){
        super("Trinagle");
        this.base = base;
        this.height = height;
    }
    public int getSidesCount(){
        return 3;
    }
    public double getPerimeter(){
        return 3;
    }
    public double getArea(){
        return (base*height)/2;
    }
}
