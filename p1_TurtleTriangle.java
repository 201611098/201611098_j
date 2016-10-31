import ch.aplu.turtle.*;

public class p1_TurtleTriangle{
  Turtle t1=new Turtle();
  void drawSquareOrTriangle(int size,int sides, double angle){
    t1.home();
    t1.clear();
    for(int i=0;i<sides;i++){
      t1.forward(size);
      t1.right(angle);
    }
  }
  enum Shape {TRIANGLE, SQUARE}
  public static void main(String[] args){
      Shape sel=Shape.TRIANGLE;
      int size=100;
      int sides;
      double angle;
      switch (sel) {
          case TRIANGLE:
              sides=3;
              angle=120;
              break;
          case SQUARE:
              sides=4;
              angle=90;
              break;
      }   
  }
 drawSquareOrTriangle(100,sides,angle);
 }



