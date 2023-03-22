package oop.parcial2;

public class Rectangle extends Shape{
    private int base, height;
    public Rectangle(int base, int height){
        super("Rectangle");
        this.base = base;
        this.height = height;
    }
    public int getSidesCount(){
        return 4;
    }
    public double getPerimeter(){
        return 4;
    }
    public double getArea(){
        return base*height;
    }
}
