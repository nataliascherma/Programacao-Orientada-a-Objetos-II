public class Rectangle extends Shape {

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        super(width, height, "rectangle");
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}
