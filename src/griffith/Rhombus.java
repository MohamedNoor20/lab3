// Mohamed Abdikadir Noor
// 3141112

package griffith;

public class Rhombus extends Shape {

    private double side;
    private double height;
    // Constructor
    public Rhombus(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }
    // Getter
    public double getSide() {
        return side;
    }
    // Getter
    public double getHeight() {
        return height;
    }
    
    // No setter because it is treated as immutable objects

    // overriding the parent class
    @Override
    public double area() {
        return 0;   
    }

    @Override
    public double perimeter() {
        return 0;   
    }

    @Override
    public String toString() {
        return super.toString() + " Side: " + side + " Height: " + height;
    }
}
