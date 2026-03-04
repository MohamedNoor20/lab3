// Mohamed Abdikadir Noor
// 3141112

package griffith;

public class Circle extends Shape {

    private double radius;
    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    // Getter
    public double getRadius() {
        return radius;
    }
    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
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
        return super.toString() + " Radius: " + radius;
    }
}