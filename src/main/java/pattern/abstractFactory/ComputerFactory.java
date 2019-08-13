package pattern.abstractFactory;

import pattern.domain.Keyboard;
import pattern.domain.Mouse;

public interface ComputerFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
}
