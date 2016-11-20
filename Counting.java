import java.util.Map;
import java.util.HashMap;

class Counting{
	char[] words="sangmyung university".toCharArray();
	Map<String,Integer> w=new HashMap<String,Integer>();
	void Result(){
		this.words=words;
		String element;
		for(char c:words){
			element=Character.toString(c);
			if(w.containsKey(element)){
				w.put(element,w.get(element)+1);
			}
			else{
				w.put(element,1);
			}
		}
		System.out.print(words);
		System.out.print("->");
		System.out.print(w);
	}
	public static void main(String[] args){
		Counting k=new Counting();
		k.Result();
	}
}