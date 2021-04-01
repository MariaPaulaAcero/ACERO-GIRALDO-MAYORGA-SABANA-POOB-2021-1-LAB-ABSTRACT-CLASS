package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private static Square r1;
    private static Square r2;
    private static Square r3;
    private static Square r4;

    @BeforeAll
    public static void setUp() {
        r1 = new Square(10.0,10.0);
        r2 = new Square(20.0,20.0);
        r3 = new Square("black",25.0,25.0);
        r4 = new Square(3.0,3.0);


       /* r1 = new Square(10.0,10.0,10.0,10.0);
        r2 = new Square(20.0,20.0,20.0,20.0);
        r3 = new Square("black",25.0,25.0,25.0,25.0);
        r4 = new Square(3.0,3.0,3.0,3.0);

        */
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(100, (int) r1.getArea());
        assertEquals(400, (int) r2.getArea());
        assertEquals(625, (int) r3.getArea());
        assertEquals(9, (int) r4.getArea());

    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(40, (int) r1.getPerimeter());
        assertEquals(80, (int) r2.getPerimeter());
        assertEquals(100,(int) r3.getPerimeter());
        assertEquals(12, (int) r4.getPerimeter());
    }
    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(14, (int) r1.getDiagonal());
        assertEquals(28, (int) r2.getDiagonal());
        assertEquals(35, (int) r3.getDiagonal());
        assertEquals(4,  (int) r4.getDiagonal());

    }

    @Test
    public void shouldPrintSquare() {


        assertEquals("This is a Square with color NONE and width 10.0 and lenght 10.0", r1.toString());
        assertEquals("This is a Square with color NONE and width 20.0 and lenght 20.0", r2.toString());
        assertEquals("This is a Square with color black and width 25.0 and lenght 25.0", r3.toString());
        assertEquals("This is a Square with color NONE and width 3.0 and lenght 3.0", r4.toString());
    }

}
