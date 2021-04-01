package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;

    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle(10.0,12.0);
        r2 = new Rectangle(14.5,20.0);
        r3 = new Rectangle("blue",25.5,40.0);
        r4 = new Rectangle(3.0,1.0);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(120, (int) r1.getArea());
        assertEquals(290, (int) r2.getArea());
        assertEquals(1020, (int) r3.getArea());
        assertEquals(3, (int) r4.getArea());

    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(44, (int) r1.getPerimeter());
        assertEquals(69, (int) r2.getPerimeter());
        assertEquals(131, (int) r3.getPerimeter());
        assertEquals(8, (int) r4.getPerimeter());
    }
    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(4, (int) r1.getDiagonal());
        assertEquals(5, (int) r2.getDiagonal());
        assertEquals(8, (int) r3.getDiagonal());
        assertEquals(2, (int) r4.getDiagonal());

    }

    @Test
    public void shouldPrintRectangle() {


        assertEquals("This is a Rectangle with color NONE and width 10.0 and lenght 12.0", r1.toString());
        assertEquals("This is a Rectangle with color NONE and width 14.5 and lenght 20.0", r2.toString());
        assertEquals("This is a Rectangle with color blue and width 25.5 and lenght 40.0", r3.toString());
        assertEquals("This is a Rectangle with color NONE and width 3.0 and lenght 1.0", r4.toString());
    }

}
