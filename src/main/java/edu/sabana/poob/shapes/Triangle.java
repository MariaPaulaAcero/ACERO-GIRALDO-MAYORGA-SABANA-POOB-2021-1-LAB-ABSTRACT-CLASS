package edu.sabana.poob.shapes;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1=1.0;
        this.side2=1.0;
        this.side3=1.0;
    }
    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public Triangle(String color){
        super(color);
    }
    public Triangle(String color, double side1,double side2,double side3){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public boolean isIsosceles(){
        boolean result= false;

        if((side1 == side2 && side2!=side3 && side1!=side3)||(side1!= side2 && side2!=side3 && side1==side3)
                ||(side1!=side2 && side2== side3 && side1!=side3)){
            result = true;

        }
        return result;
    }
    public boolean isEquilateral(){
        boolean result= false;
        if(side1 == side2 && side2==side3 && side1==side3){
            result = true;
        }
        return result;

    }
    public double getPerimeter (){
        double perimeter = this.side1+this.side2+this.side3;
        return perimeter;
    }
    public double getArea (){
        double area= this.side1*this.side2/2;
        return area;
    }

    public String toString (){
        return super.toString() + " side1 " + side1 + " side2 " + side2 + " and side3 " + side3;
    }

}
