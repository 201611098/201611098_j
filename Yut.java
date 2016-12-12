package com.sd.game;

public class Yut extends Dice{
    private String yut=null;
    private int number=0;
    public int roll_(){
        setNum((int)(Math.random()*5)+1);
        setYut();
        return getNum();
    }
    public void setYut(){
        this.yut=yut;
        if (getNum()==1)
            yut="do";
        else if (getNum()==2)
            yut="gae";
        else if (getNum()==3)
            yut="gul";
        else if (getNum()==4)
            yut="yut";
        else if (getNum()==5)
            yut="mo";
    }
    public String getYut(){
        return yut;
    }
}