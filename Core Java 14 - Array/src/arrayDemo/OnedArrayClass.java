package arrayDemo;
//followed Automation Testing Insider tutorials
public class OnedArrayClass {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(a[4]);

		System.out.println("Length of array is:" + a.length);

		/*
		 * for (int i = 0; i <= a.length - 1; i++) {
		 * 
		 * System.out.println(a[i]);
		 * 
		 * }
		 */

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

	}

}
