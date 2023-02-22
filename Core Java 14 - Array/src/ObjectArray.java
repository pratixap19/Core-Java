//When we want to add elements of different data type then we need to use Object type of data.
public class ObjectArray {

	public static void main(String[] args) {
		
		Object a[] = new Object[5];
		a[0]= 10;//integer
		a[1]= 10.5;	//float	
		a[2]= "Welcome";//string
		a[3]= 'c';//char
		a[4]= true;//boolean
		
		for(Object i:a) {
			System.out.println(i);
			}
		
		
	}

}
