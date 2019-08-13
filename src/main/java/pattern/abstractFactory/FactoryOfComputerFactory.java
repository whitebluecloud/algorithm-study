package pattern.abstractFactory;

import pattern.domain.ComputerType;

public class FactoryOfComputerFactory {
    public void createComputer(ComputerType type){
        ComputerFactory computerFactory = null;
        switch(type){
            case LG:
                computerFactory = new LGComputerFactory();
                break;
            case SAMSUNG:
                computerFactory = new SamsungComputerFactory();
                break;
        }
        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
