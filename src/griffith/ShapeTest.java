// Mohamed Abdikadir Noor
// 3141112

package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ShapeTest {

	// Circle
	
	@Test
	public void testCircleArea() {
	    Circle c = new Circle("Circle", 3.0);
	    assertEquals(28.27, c.area(), 0.1);
	}

	@Test
	public void testCirclePerimeter() {
	    Circle c = new Circle("Circle", 3.0);
	    assertEquals(18.85, c.perimeter(), 0.1);
	}

	@Test
	public void testCircleToString() {
	    Circle c = new Circle("Circle", 3.0);
	    assertTrue(c.toString().contains("Radius: 3.0"));
	}

	// Rhombus
	
	
	@Test
	public void testRhombusArea() {
	    Rhombus r = new Rhombus("Rhombus", 4, 3);
	    assertEquals(12, r.area(), 0.1);
	}

	@Test
	public void testRhombusPerimeter() {
	    Rhombus r = new Rhombus("Rhombus", 4, 3);
	    assertEquals(16, r.perimeter(), 0.1);
	}

	@Test
	public void testRhombusToString() {
	    Rhombus r = new Rhombus("Rhombus", 4, 3);
	    assertTrue(r.toString().contains("Side: 4.0"));
	}
	
	// TriangleArea
	
	@Test
	public void testTriangleArea() {
	    RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
	    assertEquals(6, t.area(), 0.1);
	}

	@Test
	public void testTrianglePerimeter() {
	    RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
	    assertEquals(12, t.perimeter(), 0.1);
	}

	@Test
	public void testTriangleToString() {
	    RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
	    assertTrue(t.toString().contains("Base: 3.0"));
	}
	
	@Test
	public void integrationTestShapesList() {

	    ArrayList<Shape> shapes = new ArrayList<>();

	    shapes.add(new Circle("Circle1", 3));
	    shapes.add(new Circle("Circle2", 4));

	    shapes.add(new Rhombus("Rhombus1", 4, 3));
	    shapes.add(new Rhombus("Rhombus2", 5, 2));

	    shapes.add(new RightAngledTriangle("Triangle1", 3, 4));
	    shapes.add(new RightAngledTriangle("Triangle2", 5, 12));

	    for (Shape s : shapes) {
	        assertTrue(s.area() > 0);
	        assertTrue(s.perimeter() > 0);
	    }
	}

}
