
public class Geekyshows {

	
	public static void main(String[] args) {
		Addition adj = new Addition();
		adj.disp(20);
	}

}

class Addition{
	void disp(int a) {
		int x = 10;
		int y = a;
		int z = x+y;
		System.out.println("Addition = " + z);
		
	}
}