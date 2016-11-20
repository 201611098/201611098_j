class Reverse{

	String word="hello";

	void result(){
		this.word=word;
		char[] chArr=word.toCharArray();
		StringBuilder reverse=new StringBuilder();
		for(int i=chArr.length-1;i>=0;i--){
			reverse.append(chArr[i]);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args){
		Reverse r=new Reverse();
		r.result();
	}
}