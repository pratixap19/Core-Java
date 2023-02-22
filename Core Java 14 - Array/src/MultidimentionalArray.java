
public class MultidimentionalArray {

	public static void main(String[] args) {

		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 5, 2, 11 } };

		System.out.println(b[1][2]);
		
		for(int i=0; i<3; i++) //first for loop represents raws
		{
			
			for(int j=0;j<3; j++) //second for loop represents columns
			{
				System.out.println(b[i][j]);
			}
		}

	}

}
