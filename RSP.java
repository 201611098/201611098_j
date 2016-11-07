class RSP{
	String a;
	String b;
	void PlayerA(String a){
		this.a=a;
		System.out.println("A:"+a);
	}
	void PlayerB(String b){
		this.b=b;
		System.out.println("B:"+b);
	}
	void result(){
		if (a.equals("Rock")){
			if(b.equals("Scissors")){
 				System.out.println("A win");
			}
			else if(b.equals("Paper")){
				System.out.println("B win");
			}
			else if(b.equals("Rock")){
				System.out.println("draw");
			}
		}
		else if (a.equals("Scissors")){
			if(b.equals("Paper")){
				 System.out.println("A win");
				}
			else if(b.equals("Rock")){
				System.out.println("B win");
			}
			else if(b.equals("Scissors")){
				System.out.println("draw");
			}
		}
		else{
			if(b.equals("Rock")){
				 System.out.println("A win");
			}
			else if(b.equals("Scissors")){
				System.out.println("B win");
			}
			else if(b.equals("Paper")){
				System.out.println("draw");
			}
		}
	}
	public static void main(String[] args){
		RSP r=new RSP();
		r.PlayerA("Rock");
		r.PlayerB("Paper");
		r.result();
	}
}