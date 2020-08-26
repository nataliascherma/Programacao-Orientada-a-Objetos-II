public class AbsShape {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Erro!

        Shape shape = new Triangle(8.0, 12.0, "outlined");
        System.out.println("Object is " + shape.getName() +
                " Area is " + shape.area());
        Shape shape2 = new Rectangle(10.0, 4.0);
        System.out.println("Object is " + shape2.getName() +
                " Area is " + shape2.area());
    }
}

