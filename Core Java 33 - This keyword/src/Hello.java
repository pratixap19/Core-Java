//Automation Hub Sarthak
public class Hello {
	
	int i;//default value is 0
	String s1;//default value is null
	
	public void learn(int i, String s1) {
		
		i = i;//local variable is equated to local variable so it will execute default value
		s1 = s1;
		//this.i=i;//local variable is equated to global variable so it will execute value which is assign to it.
		//this.s1 = s1;
		
	}
	
	public void learnMore() {
		System.out.println(i);
		System.out.println(s1);
	}

}
