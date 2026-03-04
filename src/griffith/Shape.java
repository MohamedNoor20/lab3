// Mohamed Abdikadir Noor
// 3141112

package griffith;

public abstract class Shape {

    private String name;
    // Constructor 
    public Shape(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // NO implementation
    public abstract double area();
    
    public abstract double perimeter();

    @Override
    public String toString() {
        return name;
    }
}
