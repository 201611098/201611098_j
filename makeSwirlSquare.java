import ch.aplu.turtle.*;

public class MakeSwirlSquare{
  static Turtle t1=new Turtle();

  public void makeSwirlSquare(int size,int bigger,int turns,double degree){
    for(int i=0; i<turns; i++){
      if(i%2!=0){
         size+=bigger;
      }
      t1.forward(size);
      t1.right(degree);
  //System.out.printf("%d-%d\n",i,size);
    }
    public static void main(String[] args){
      makeSwirlSquare(30,30,30,90.0);
    }   
  }
}
