package methods;

public class Demo1 {
	
	
	
	public int m1(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	


	public static void main(String[] args) {
		
		Demo1 obj=new Demo1();
		int d=obj.m1(10, 200);
		System.out.println(d);
		
		int e=obj.m1(1000, 2000);
		System.out.println(e);
	}

}
