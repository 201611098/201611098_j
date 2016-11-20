import java.util.ArrayList;
import java.util.Collections;

class Student{
	private String name;
	private int num;
	Student(String name, int num){
		this.name=name;
		this.num=num;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args){
		ArrayList<String> studentNameList=new ArrayList<String>();
		Student s1=new Student("lhi_1",201611098);
		Student s2=new Student("lhi_2",201611099);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
}