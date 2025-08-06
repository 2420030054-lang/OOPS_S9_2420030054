package project4;

public class static1 {
	
	
	static int a;
	
	public  static void  method1()
	
	{
		a=a+1;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(a);
	method1();
	a=a+1;
	System.out.println(a);
	method1();
	}

}
