// Shape interface
interface Shape {
    void draw();
}

// Implement concrete classes (Circle, Rectangle, Square)
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle....");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle......");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.....");
    }
}

// Factory class for object creation
class ShapeFactory {

    // Factory Method: Returns a Shape object based on the input type
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        // Convert to lowercase for easy comparison
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Create the factory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Use the factory instead of 'new' keyword
        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");

        // Draw shapes
        if (circle != null) circle.draw();
        if (rectangle != null) rectangle.draw();
        if (square != null) square.draw();
    }
}
