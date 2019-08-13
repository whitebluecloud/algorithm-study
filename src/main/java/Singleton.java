public class Singleton {

    private Singleton() {};

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public Singleton getInstance(){
        return SingletonHolder.instance;
    }
}