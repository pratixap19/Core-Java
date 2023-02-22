
public class Example {

	public int nonStaticValue;

	public Example() {
		nonStaticValue = 28;
	}

	public static void main(String[] args) {
		Example ec = new Example();
		System.out.println("Nonstatic variable value is " + ec.nonStaticValue); // See, with an instance you can get the
																				// value, but try removing 'ec.' and see
																				// if you can run it.
	}

}
