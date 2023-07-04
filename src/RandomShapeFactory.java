public class RandomShapeFactory {
    public Shape getShape() {
        int randomNumber = (int) (Math.random() * 4);

        if (randomNumber == 0) {
            return new Circle();
        } else if (randomNumber == 1) {
            return new Rectangle();
        } else if (randomNumber == 2) {
            return new Triangle();
        } else {
            return new Square();
        }
    }
}
