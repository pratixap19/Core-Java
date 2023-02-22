package arrayDemo;

//followed Automation Testing Insider tutorials
public class TwodArrayClass {

	public static void main(String[] args) {

		int a[][] = { { 2, 3 }, { 3, 5 }, { 5, 7 } };// 3 rows and 2 columns

		for (int i = 0; i < 3; i++) // first for loop represents raws
		{
			for (int j = 0; j < 2; j++)// second for loop represents columns
			{
               System.out.println(a[i][j] + " ");
			}
			
			System.out.println("");
		}

	}

}
