package com.sd.gui;

import javax.swing.*;
import java.awt.*;

public class  CalcAreaGUIMain{
  public static void main(String[] args){
    JFrame f=new JFrame();
    Jpanel panel=new Jpanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("������");
    JTextField radiusTf1=new JTextField(10);
    JButton b1=new JButton("���");
    JButton b2=new JButton("���");
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(b1);
    panel.add(b2);
    f.pack();
    f.setVisible(true);
  }
}