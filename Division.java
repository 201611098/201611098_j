import java.util.ArrayList;

class Division{
	ArrayList<Integer> x=new ArrayList<Integer>();
	void divise(){
		for(int i=1;i<1001;i++){
			if(i%4==0){
				if(i%5!=0){
					x.add(i);
				}
			}
		}
		System.out.println(x);
	}
	public static void main(String[] args){
		Division d=new Division();
		d.divise();
	}
}
