// Mohamed Abdikadir Noor
// 3141112

package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

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

}
