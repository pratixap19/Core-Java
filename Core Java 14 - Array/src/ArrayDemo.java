
public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		String s[] = new String[3];
		
		s[0] = "Automation";
		s[1] = "QA";
		s[2] = "Tester";
		
		for(String i:s) {
			
			System.out.println(i);
			
		}

	}

}
