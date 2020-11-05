import shape.factory.AbstractFactory;
import shape.factory.AngledShapeFactory;
import shape.factory.RoundedShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        switch (type) {
            case "ANGLED":
                return new AngledShapeFactory();
            case "ROUNDED":
                return new RoundedShapeFactory();
            default:
                return null;
        }
    }


}
