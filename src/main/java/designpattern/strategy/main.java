package designpattern.strategy;

public class main {

    public static void main(String[] args){

        GameUser gameUser = new GameUser();

        gameUser.attack();

        gameUser.setWeapon(new Staff());
        gameUser.attack();

        gameUser.setWeapon(new Knife());
        gameUser.attack();
    }
}
