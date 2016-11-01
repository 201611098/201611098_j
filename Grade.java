class Grade{
  float score;
  public void setScore(float score){
    this.score=score;
  }
  //public void getGrade(){
    //return float score;
  //}
  public void decideGrade(float score){
    if(90<=score && score<=100){
      System.out.println("A");
    }
    if(80<=score && score<90){
      System.out.println("B");
    }
    if(70<=score && score<80){
      System.out.println("C");
    }
    if(60<=score && score<70){
      System.out.println("D");
    }
    if(score<60){
      System.out.println("F");
    }
  }
}      