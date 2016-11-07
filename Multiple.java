class Multiple{
	int[] x={1,2,3,4,5,6,7,8,9};
	void result(){
		for(int i:x){
			System.out.printf("\n%d -",i);
			for(int j:x){
				System.out.printf("\t%dX%d=%2d",i,j,i*j);
			}
		}
	}
	public static void main(String[] args){
			Multiple m=new Multiple();
			m.result();
		}
}