package com.sd.yutgame;

public class YutGame extends DiceGame {
    private Player p1;
    private Player p2;
    private String winner;
    public void startGame(){
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