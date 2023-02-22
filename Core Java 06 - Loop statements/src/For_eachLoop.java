
public class For_eachLoop {
	// Automation Hub Sarthak
	// It is calle denhanced for loop or Mutated loop
	// used with Arrays and Collection
	// This loop iterates through each element of the array or collection
	// Syntax is easy. Code more readable and less complecated

	public static void main(String[] args) {

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		
		for(char item:vowels) {
			System.out.println(item + " ");
		}
		
		//program:Sum of integer array
		int numbers[] = {10,10,10,10,10};
		
		int sum = 0;
		
		for(int i:numbers) {
			sum = sum + i;
		}
		
		System.out.println("Sum of numbers is:" + sum);
	}

}
