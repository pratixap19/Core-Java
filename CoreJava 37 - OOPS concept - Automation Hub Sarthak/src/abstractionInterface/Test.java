package abstractionInterface;
//multiple inheritance
//One normal class can extend abstract class and inherit multiple interfaces at the same time.
public class Test extends Check implements Intro, Conclusion{
	
	@Override
	public void display() {
		System.out.println("This is Test class display method");
		
	}
	
	@Override
	public void display1() {
		
		System.out.println("This is Test class display1 method");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.display();
		test.display1();
		test.climaxStory();
		test.endOfStory();
		test.cross();

	}

	@Override
	public void endOfStory() {
		System.out.println("Method from Conclusion interface");
		
	}

	@Override
	public void climaxStory() {
		System.out.println("Method from Conclusion interface");
		
	}

	@Override
	void cross() {
		System.out.println("This method is from Check class");
		
	}

	

	

}
