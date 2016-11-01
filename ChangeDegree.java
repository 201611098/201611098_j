class ChangeDegree{
  float degree;
  String name;
  public void setDegree(float d){
    float degree=d;
  }
  public void setName(String s){
    String name=s;
  }
  public void getDegree(){
    return degree;
  }
  public void getName(){
    return name;
  }
  public void CtoF(float d){
    this.d=(d*1.8)+3.2;
    System.out.println(float d);
  }
  public void FtoC(float d){
    this.d=(d-32)/1.8;
    System.out.println(float d);
  }
  public void change(float d,String s){
    if(s.equals("C")){
      CtoF(float d);
    elseif(s.equals("F")){
      FtoC(float d);
    } 
    else{
      default;
    }
  }
}    
