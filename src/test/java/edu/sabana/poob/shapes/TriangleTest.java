package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {
    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;
    @BeforeAll
    public static void setUp() {

        t1 = new Triangle(12.5,12.5,20.0);
        t2 = new Triangle(14.5,14.5,14.5);
        t3 = new Triangle("red",20.0,24.0,20.0);
        t4 = new Triangle(12.0,10.0,11.0);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(78, (int) t1.getArea());
        assertEquals(105, (int) t2.getArea());
        assertEquals(240, (int) t3.getArea());
        assertEquals(60, (int) t4.getArea());
    }
    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(45, (int) t1.getPerimeter());
        assertEquals(43, (int) t2.getPerimeter());
        assertEquals(64, (int) t3.getPerimeter());
        assertEquals(33, (int) t4.getPerimeter());
    }
    @Test
    public void shouldShowIfIsIsoceles() {
        Triangle triangle1 = new Triangle(12.5,12.5,20.0);
        assertTrue(triangle1.isIsosceles(), "isIsoceles");
    }

    @Test
    public void shouldShowIfIsEquilateral() {
        Triangle triangle1 = new Triangle(12.5,12.5,12.5);
        assertTrue(triangle1.isEquilateral(), "isEquilateral");
    }


    @Test
    public void shouldPrintTriangle() {
        assertEquals("This is a Triangle with color NONE side1 12.5 side2 12.5 and side3 20.0", t1.toString());
        assertEquals("This is a Triangle with color NONE side1 14.5 side2 14.5 and side3 14.5", t2.toString());
        assertEquals("This is a Triangle with color red side1 20.0 side2 24.0 and side3 20.0", t3.toString());
        assertEquals("This is a Triangle with color NONE side1 12.0 side2 10.0 and side3 11.0", t4.toString());
    }
}

