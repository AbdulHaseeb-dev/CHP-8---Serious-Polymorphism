public class polymorphism {
    public static void main(String[] args) {
        // Creating instances of Shape, Circle, and Square
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        // Polymorphic behavior - calling draw on different objects
        shape.draw();   // Output: Drawing a shape
        circle.draw();  // Output: Drawing a circle
        square.draw();  // Output: Drawing a square

        // Using polymorphism in an array
        Shape[] shapes = new Shape[3];
        shapes[0] = shape;
        shapes[1] = circle;
        shapes[2] = square;

        // Looping through the array and calling draw on each object
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

