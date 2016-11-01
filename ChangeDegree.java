class ChangeDegree{
  float degree;
  String name;
  public void setDegree(float d){
    float degree=d;
  }
  public void setString(String s);
    String name=s;
  }
  public void CtoF(float d){
    this.d=(d*1.8)+3.2;
  }
  public void FtoC(float d){
    this.d=(d-32)/1.8;
  }
  public void change(float d){
    if(s.equals("C")){
      CtoF(float d);
    } 
  }
  public void change(float d){
    if(s.equals("F")){
      FtoC(float d);
    } 
  }
}      