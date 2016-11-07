class BMI{
	double weight;
	double height;
	double bmi;
	void clacB(double weight,double height){
		bmi=10000*weight/(height*height);
		System.out.println("BMI is:"+bmi);
	}
	void result(){
		if (bmi<=18.5){
			System.out.println("low");
		}
		else if (18.5<=bmi && bmi<23){
			System.out.println("normal");
		}
		else if (23<=bmi && bmi<25){
			System.out.println("high");
		}
		else if (25<=bmi && bmi<30){
			System.out.println("obesity 1");
		}		
		else if (30<=bmi && bmi<40){
			System.out.println("obesity 2");
		}	
		else if (bmi>40){
			System.out.println("obesity 3");
		}	
		else{
			System.out.println("error");
		}
	}
	public static void main(String[] args){
		BMI b=new BMI();
		b.calcB(50.0,160.0);
		b.result();
	}
}