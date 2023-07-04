public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        RandomShapeFactory randomShapeFactory = new RandomShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw(); // Output: Drawing a circle

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw(); // Output: Drawing a rectangle

        Shape randomShape = randomShapeFactory.getShape();
        randomShape.draw(); // Output: Drawing a random shape (circle, rectangle, triangle, or square)

        Shape randomShape2 = randomShapeFactory.getShape();
        randomShape2.draw(); // Output: Drawing a random shape (circle, rectangle, triangle, or square)
    }
}
