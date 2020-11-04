public class EagerInitSingleObject {
    private EagerInitSingleObject(){
        System.out.println("call EagerInitSingleObject constructor");
    }

    private static EagerInitSingleObject instance = new EagerInitSingleObject();

    public static EagerInitSingleObject getInstance(){
        return instance;
    }
}