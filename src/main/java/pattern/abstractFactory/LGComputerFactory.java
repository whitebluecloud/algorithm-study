package pattern.abstractFactory;

import pattern.domain.Keyboard;
import pattern.domain.LGKeyboard;
import pattern.domain.LGMouse;
import pattern.domain.Mouse;

public class LGComputerFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
