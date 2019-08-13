package pattern.factory;

import pattern.domain.LGMouse;
import pattern.domain.Mouse;
import pattern.domain.SamsungMouse;

public class MouseFactory {
    public Mouse createMouse(String type){
        Mouse mouse = null;
        switch (type) {
            case "LG":
                mouse = new LGMouse();
                break;
            case "Samsung":
                mouse = new SamsungMouse();
                break;
        }
        return mouse;
    }
}
