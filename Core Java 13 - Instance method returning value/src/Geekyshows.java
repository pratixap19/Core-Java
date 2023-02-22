
class Test{
	
	int add(){
		int a=10;
		int b=20;
		return(a+b);
	}
	
	int mult(int p){
		int k=p;
		return(k*k);
	}
	
}

class Geekyshows {

	public static void main(String[] args) {
		
		Test obj = new Test();
		System.out.println(obj.add());
		int r= obj.mult(8);
		System.out.println(r);
	}

}
