package com.sd.io;

import java.util.Scanner;

public class CalcAreaMain{
  public stastic void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("�������� �Է��ϼ���:");
    sc.nextDouble();
    double r=sc.neextDouble();
    double area=Math.PI*MAth.pow(r,2);
    System.out.print("r:%.2f area:%.2f",r,area);
  }
}