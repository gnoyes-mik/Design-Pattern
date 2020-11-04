public class LazyInitSingleObject{
    private static LazyInitSingleObject instance = new LazyInitSingleObject();

    private LazyInitSingleObject(){
        System.out.println("call LazyInitSingleObject constructor");
    }

    public static LazyInitSingleObject getInstance(){
        if(instance == null){
            instance = new LazyInitSingleObject();
        }
        return instance;
    }
}