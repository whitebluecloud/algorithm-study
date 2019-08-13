package pattern.factory;

public class Client implements Runnable {

    @Override
    public void run() {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("LG");
    }
}
