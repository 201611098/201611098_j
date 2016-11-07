class Triangle{
	String s="*";
	void add(int num){
		StringBuffer sbuf=new StringBuffer();
		for(int i=num-1;i>0;i--){
				for(int j=i-1;j<num;j++){
					sbuf.append(" ");
				}
				for(int k=i*2-1;k>0;k--){
					sbuf.append(s);
				}
				System.out.println(sbuf);
				sbuf.delete(0,sbuf.length());
		}
	}
	public static void main(String[] args){
		Triangle t=new Triangle();
		t.add(5);
	}
}