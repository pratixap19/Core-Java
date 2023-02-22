package controlstatement;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		int j = 0;
		while(j < 10) {
			System.out.println(j);	
			if( j== 5) {
				break;
			}
			j++;
		}
		
	
	}

}
