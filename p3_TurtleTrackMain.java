import ch.aplu.turtle.*;

public class p3_TurtleTrackMain{
  static void drawSquareFrom(double[][] tracks){
      Turtle t1=new Turtle();
      for(double[] t:tracks){
         t1.moveTo(t[0],t[1]);
      }
  }
  public static void main(String[] args){
      double[][] tracks={{100,100},{200,100},{200,200},{100,200},{100,100}};
      //p3_TurtleTrackMain p3=new p3_TurtleTrackMain();
      drawSquareFrom(tracks);
  }
}