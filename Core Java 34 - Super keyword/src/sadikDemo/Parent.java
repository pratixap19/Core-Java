package sadikDemo;

public class Parent {

	int number = 1000;

	public Parent() {
		System.out.println("Parent class default constructor");
	}

	public Parent(int number) {
		System.out.println("Parent class paramiterized constructor");
		this.number=number;
	}
		public int setValue(int number) {
			System.out.println("Parent class variable value assigned");
			 this.number=number;
			 return number;
		}
	}

