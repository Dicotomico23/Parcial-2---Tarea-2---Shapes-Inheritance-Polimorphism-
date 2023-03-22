package oop.parcial2;

public class Circle extends Shape{
    private int radious;
    private final double PI = 3.14;
    public Circle(int radious){
        super("Circle");
        this.radious = radious;
    }
    public int getSidesCount(){
        return 0;
    }
    public double getPerimeter(){
        return PI*(radious*2);
    }
    public double getArea(){
        return PI*(radious*radious);
    }
}
