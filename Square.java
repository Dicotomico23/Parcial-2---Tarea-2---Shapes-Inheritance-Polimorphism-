package oop.parcial2;

public class Square extends Shape{
    private int side;
    public Square(int side){
        super("Square");
        this.side = side;
    }
    public int getSidesCount(){
        return 4;
    }
    public double getPerimeter(){
        return side*4;
    }
    public double getArea(){
        return side*side;
    }

}
