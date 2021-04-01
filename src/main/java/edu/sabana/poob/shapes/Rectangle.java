package edu.sabana.poob.shapes;

public class Rectangle extends  Shape {

    private double width;
    private double lenght;

    public Rectangle() {
        this.width = 1.0;
        this.lenght= 1.0;

    }

    public Rectangle(double width,double lenght) {
        this.width = width;
        this.lenght= lenght;

    }
    public Rectangle (String color){
        super(color);
    }

    public Rectangle (String color, double width,double lenght) {
        super(color);
        this.width = width;
        this.lenght = lenght;

    }

    public double getDiagonal(){
        double diagonalAlCuadrado = this.width+this.lenght;
        double diagonal=Math.sqrt(diagonalAlCuadrado);
        return diagonal;
    }

    public double getArea (){
        double area= this.width*this.lenght;
        return  area;
    }


    public double getPerimeter (){
        double perimeter = 2*(this.width+this.lenght);
        return perimeter;
    }
    public double getWidth(){
        return width;
    }
    public double getLenght(){
        return lenght;
    }

    public String toString() {
        return super.toString()+" and width " + this.width + " and lenght "+this.lenght;
    }

}
