package com.sd.game;

public class DiceGame extends Dice{
    private Player p1;
    private Player p2;
    public void start(){
        p1=new Player("A");
        p2=new Player("B");
        p1.play();
        p2.play();
        if (p1.getNum()>p2.getNum()){
            p1.getName();
        }
        else if (p1.getNum()==p2.getNum()){
            p2.getName();
        }
    }
}