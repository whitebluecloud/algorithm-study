package pattern.domain;

import pattern.abstractFactory.ComputerFactory;

public enum ComputerType {
    LG("LG"),
    SAMSUNG("SAMSUNG");

    public String name;

    ComputerType(String name){
        this.name = name;
    }
}
