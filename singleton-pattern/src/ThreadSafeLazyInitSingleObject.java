public class ThreadSafeLazyInitSingleObject {
    private ThreadSafeLazyInitSingleObject(){}

    private static class Holder{
        public static final ThreadSafeLazyInitSingleObject instance = new ThreadSafeLazyInitSingleObject();
    }

    public static ThreadSafeLazyInitSingleObject getInstance(){
        return Holder.instance;
    }
}
