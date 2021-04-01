package edu.sabana.poob.shapes;

public class Square extends Rectangle{
    private double side1;


    public Square() {
        side1 =1.0;

    }

    public Square (double side1){
        //super(width,lenght);
        this.side1= side1;

    }
    public Square (String color){
        super(color);
    }
    public Square (double width, double lenght){
        super(width,lenght);
    }
    public Square (String color,double width,double lenght){
        super(color,width,lenght);





    }

    public double getArea (){
        double side1 = super.getWidth();
        double side2 =super.getLenght();
        double area= side1*side2;
        return  area;
    }

    public double getPerimeter (){
        double side1 = super.getWidth();
        double side2 =super.getLenght();
        double perimeter = side1*2+side2*2;
        return perimeter;
    }
    public double getDiagonal(){
        double side1 = super.getWidth();
        double diagonal=Math.sqrt(2)*side1;
        return diagonal;
    }

    public String toString() {
        return super.toString();
    }

}