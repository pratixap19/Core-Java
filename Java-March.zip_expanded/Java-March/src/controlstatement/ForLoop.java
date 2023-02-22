package controlstatement;

public class ForLoop {

	public static void main(String[] args) {
	
		/*
		for(  int a=1; a<=10; a++ ) {
			System.out.println(a);			
		} */
		
		//System.out.println("Executed");
		
		// 
		
	
		for(int i=1; i<=10; i++) {
			System.out.println(2*i);
		}
		
		
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		System.out.println(2*10);
		
		String text = "Selenium automation testing session";
		
		char ch[] = text.toLowerCase().toCharArray();
		int count = 0;
		for(int i=0; i<ch.length; i++) {
			char ch1 = ch[i];
			if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
