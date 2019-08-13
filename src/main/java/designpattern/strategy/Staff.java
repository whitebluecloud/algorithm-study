package designpattern.strategy;

public class Staff implements Weapon{

    @Override
    public void attack(){
        System.out.println("지팡이 공격");
    }
}
