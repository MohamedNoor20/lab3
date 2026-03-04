// Mohamed Abdikadir Noor
// 3141112

package griffith;

public class RightAngledTriangle extends Shape {

    private double base;
    private double height;
    // Constructor
    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    // Getter
    public double getBase() {
        return base;
    }
    // Getter
    public double getHeight() {
        return height;
    }

    // No setter because it is treated as immutable objects

    // overriding the parent class
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + " Base: " + base + " Height: " + height;
    }
}
