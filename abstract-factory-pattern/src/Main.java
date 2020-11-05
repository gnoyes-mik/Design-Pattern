import shape.Shape;
import shape.factory.AbstractFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory angledShapeFactory = FactoryProducer.getFactory("ANGLED");

        Shape angledRectangle = angledShapeFactory.getShape("RECTANGLE");
        angledRectangle.draw();

        Shape angledSquare = angledShapeFactory.getShape("SQUARE");
        angledSquare.draw();



        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory("ROUNDED");

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();
    }
}
