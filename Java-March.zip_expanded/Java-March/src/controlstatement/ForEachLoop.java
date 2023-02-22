package controlstatement;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String text = "Selenium automation testing session";
		char ch[] = text.toLowerCase().toCharArray();
		
		int count = 0;
		for(char ch1 : ch) {			
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				count++;
			}
		}	
		System.out.println(count);
		
		int a[] = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		
		for(int a1 : a) {
			
			if(a1 == 20) {
				System.out.println("Found value");
				break;
			}
			System.out.println(a1);
		} 
		
		
		/*
		for(int a1 : a) {
			sum = sum + a1;
		} */
		
		// sum = 0 + 10;
		// sum = 10 + 20;
		// sum = 30 + 30
		// sum = 60 + 40
		// sum = 100 + 50
		// sum = 150 + 60;
		
		// sum = 210
		System.out.println(sum);
		//int sum = a[0]+a[1]+a[2]+a[3]+a[4]+a[5];
		//System.out.println(sum);
	}

}
