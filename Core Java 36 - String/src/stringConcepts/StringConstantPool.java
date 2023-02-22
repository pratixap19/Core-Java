package stringConcepts;

public class StringConstantPool {

	public static void main(String[] args) {
		
		String s1 = new String();//one object is created and it is stored in Heap area.
		String s2 = new String("Selenium");//two objects are created. One in heap area and other in SCP.
		System.out.println(s2);
		new String();//object will create in the Heap area without any reference. It can be removed by Garbage collector.

	}

}
