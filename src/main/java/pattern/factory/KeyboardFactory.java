package pattern.factory;

import pattern.domain.Keyboard;
import pattern.domain.LGKeyboard;
import pattern.domain.SamsungKeyboard;

public class KeyboardFactory {
    public Keyboard createKeyboard(String type) {

        Keyboard keyboard = null;
        switch (type){
            case "LG":
                keyboard = new LGKeyboard();
                break;
            case "Samsung":
                keyboard = new SamsungKeyboard();
                break;
        }
        return keyboard;
    }
}
