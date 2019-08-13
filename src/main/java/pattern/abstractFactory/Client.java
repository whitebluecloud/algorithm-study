package pattern.abstractFactory;

import pattern.domain.ComputerType;

public class Client implements Runnable {

    @Override
    public void run() {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer(ComputerType.LG);
    }
}
