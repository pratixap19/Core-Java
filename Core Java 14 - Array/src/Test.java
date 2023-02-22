
public class Test {

	//Array is a group of elements of same data type.We can retrieve/print array with for loop and for each loop.
	
	public static void main(String[] args) {
		
		int num[]  =  {12,56,67,32,12};
		
		System.out.println("Result is " + num[1]);
		
		System.out.println("....................");
		
		int sum = 0;
		
		for(int i: num) //how to read? If the element of num array is int then store it in element.
		{
			//System.out.println(i);
			
			sum=sum+i;
			System.out.println(sum);
		}
		
	}

}
