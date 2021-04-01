package edu.sabana.poob.shapes;

public class Circle extends Shape {

    public static final double PI=3.142;

    private double radius;


    public Circle() {
        this.radius = 1.0;

    }

    public Circle(double radius) {
        this.radius = radius;



    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }
    @Override
    public double getDiameter() {
        double getDiameter = 2*this.radius;
        return getDiameter;
    }
    @Override
    public double getArea (){
        double area= PI*this.radius*this.radius;
        return  area;
    }

    @Override
    public double getPerimeter (){
        double perimeter = 2*PI*this.radius;
        return perimeter;
    }
    @Override
    public String toString() {
        return super.toString()+" and radius " + radius;
    }

}
