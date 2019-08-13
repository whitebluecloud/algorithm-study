package pattern.abstractFactory;


import pattern.domain.Keyboard;
import pattern.domain.Mouse;
import pattern.domain.SamsungKeyboard;
import pattern.domain.SamsungMouse;
import pattern.factory.KeyboardFactory;

public class SamsungComputerFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
