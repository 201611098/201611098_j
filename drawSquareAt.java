void drawSquareAt(int size,double x,double y){
  setposition(x,y);
  for(int i=0; i<4; i++){
    t1.forward(size);
    t1.right(90);
  }
}