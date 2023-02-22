
public class Array {
//{1000,1001,1001,1002,1002,1001}
	// [1000:1,1001:3,1002:1]

	public static void main(String[] args) {

		String name = "pratixa";
		int len = name.length();
		String rev = "";

		for (int i=len-1; i>=0; i--) {

			rev = rev + name.charAt(i);

		}

		System.out.println(rev);

	}

}
