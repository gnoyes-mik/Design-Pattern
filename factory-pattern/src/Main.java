public class Main {
    final static ShapeFactory shapeFactory = new ShapeFactory();

    public static void main(String[] args) {
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
