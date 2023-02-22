
public class Test {
//Enhance for loop
	/* Enhance for loop is used to print elements of array.It is used to scan all elements of array.
	 * We can't use enhance for loop for specific number of element.If we need some specific number 
	 * of element then we need to use standard for loop.
	 * syntax:for(data type variable:Array_name){
	 * System.out.println(variable); 
	 */
	
	   
	public static void main(String[] args) {
		
		int [] numbers = {10,20,30,40,50};
		
		for(int x : numbers) {//how to read it? If the element of numbers array is int 
			 //then store it in x.
			
			System.out.print(x);
			System.out.print(",");
			
		}
		
		String [] name = {"Karan","Ayan", "Nayan"};
		
		for(String x : name) {
			
			System.out.print(x);
			System.out.print(",");
			
			}
	}

}
