package arrayDemo;

public class OneDimentionArray {

	public static void main(String[] args) {
		
		String str[] = {"Selenium", "UFT", "Java", "Python", "Maven", "Jenkins"};
		System.out.println("The length of array is:" + str.length);
		
		System.out.println(str[3]);
		
		for(String a:str) {
			System.out.print(a + " ");
		}
		

	}

}
