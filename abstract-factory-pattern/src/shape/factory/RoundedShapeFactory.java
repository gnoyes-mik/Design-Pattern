package shape.factory;

import shape.Shape;
import shape.rounded.RoundedRectangle;
import shape.rounded.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        switch (name) {
            case "RECTANGLE":
                return new RoundedRectangle();
            case "SQUARE":
                return new RoundedSquare();
            default:
                return null;
        }
    }
}
