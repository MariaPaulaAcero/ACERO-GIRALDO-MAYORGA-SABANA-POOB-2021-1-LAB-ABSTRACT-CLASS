package edu.sabana.poob.shapes;

public abstract class Shape {

    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public double getDiameter(){
        return 0;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }
}



