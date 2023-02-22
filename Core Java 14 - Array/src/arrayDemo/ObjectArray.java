package arrayDemo;

public class ObjectArray {

	public static void main(String[] args) {

		int i[] = { 1, 2, 3, 4, 5 };

		Object obj2[] = { 1.25, true, "Hello" };

		Object obj1[] = new Object[3];
		
		obj1[0] = true;
		obj1[1] = 12;
		obj1[2] = "Shyam";
		
		for(Object a:obj2) {
			System.out.print(a + " ");
		}
		
		for(Object b: obj1) {
			System.out.println(b + " ");
		}
	}

}
