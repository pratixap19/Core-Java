package groupingDemo;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
    @Test(groups= {"sanity"})
	public void test1() {
		System.out.println("This is test 1");
	}
    @Test(groups= {"sanity", "smoke"})
	public void test2() {
		System.out.println("This is test 2");
	}
    @Test(groups= {"sanity", "Regression"})
	public void test3() {
		System.out.println("This is test 3");
	}
    @Test(groups = {"regression"})
	public void test4() {
		System.out.println("This is test 4");
	}
}
