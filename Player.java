package com.sd.game;

public class Player extends Dice{
    private String name=null;
    private int num=0;
    public Player(String name){
        this.name=name;
    }
    public void play(){
        num=roll();
    }
    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
}