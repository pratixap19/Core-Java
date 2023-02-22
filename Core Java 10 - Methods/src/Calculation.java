//Method explanation
//1. Method may not takes parameters
//2. Methods takes parameters
//3. Method returns some value
//4. Method may not return any value
public class Calculation {
	
	int a;
	int b;
	
	//1.Method may not takes parameters
	//4. Method may not return any value
	/*void sum() {
		System.out.println(a+b);
	}*/
	
	//2. Methods takes parameters
	
	/*void sum(int x, int y) {
		a=x;
		b=y;
		System.out.println(a+b);
		
	}*/
	
	//3. Method returns some value
	
	int sum() {
		return(a+b);
	}

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
		//1. Method may not takes parameters
		//4. Method may not return any value
		/*cal.a=100;
		cal.b=200;
		cal.sum();*/
		
		//2. Methods takes parameters
		//cal.sum(10,200);
		
		//3. Method returns some value
		cal.a = 5;
		cal.b = 10;
		int s = cal.sum();
		System.out.println("Sum is"+ " " + s);
		
		
	}

}
