package shape.factory;

import shape.Shape;
import shape.angled.AngledRectangle;
import shape.angled.AngledSquare;

public class AngledShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        switch (name){
            case "RECTANGLE":
                return new AngledRectangle();
            case "SQUARE":
                return new AngledSquare();
            default:
                return null;
        }
    }
}
