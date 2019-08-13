package pattern.factory;

import pattern.domain.Keyboard;
import pattern.domain.Mouse;

public class ComputerFactory {

    // computer 구성품이 늘수록 아래의 객체생성메소드가 늘어난다...
    public void createComputer(String type){
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();

        Keyboard keyboard = keyboardFactory.createKeyboard(type);
        Mouse mouse = mouseFactory.createMouse(type);
        System.out.println("===computer create===");
    }
}
