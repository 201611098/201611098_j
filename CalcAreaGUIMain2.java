package com.sd.gui;

import javax.swing.*;
import java.awt.*;

public class  CalcAreaGUIMain2 extends JFrame implements ActionListener{
  JTextField radiusTf1;
  JTextField areaTf2;
  public CalcAreaGUIMain2(){
    //JFrame f=new JFrame();
    Jpanel panel=new Jpanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("반지름");
    radiusTf1=new JTextField(10);
    JButton b1=new JButton("계산");
    JButton b2=new JButton("취소");
    b1.addActionListener(this);
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(b1);
    panel.add(b2);
    pack();
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    b.setText("계산했습니다.");
    Double r=Double.parseDouble(radiusTf1.getText());
    areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
  }
  public static void main(String[] args){
    CalcAreaGUIMain2 c=new CalcAreaGUIMain();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible();
}