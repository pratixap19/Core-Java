
public class Calculator {
	
	public int getSum(int num1, int num2) {
		int result = num1+num2;
		return result;
		
	public int getSub(int num1, int num2) {
			
			return num1-num2;
		}
	public int getMulti(int num1, int num2) {
		
		return num1*num2;
	}
	public int getDiv(int num1, int num2) {
		
		return num1/num2;
	}
		
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int i = cal.getSum(10, 20);
		System.out.println(i);
		
		System.out.println(cal.getSub(4,2));
	}

}
