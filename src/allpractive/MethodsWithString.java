package allpractive;

public class MethodsWithString {
	
	
	//non static method with String return and 0 args
		public String m1() {
			String a="Selenium";
			String b="Java";
			String c=a.concat(b);
			return c;
		}
		
		
		
		

	public static void main(String[] args) {
		
		MethodsWithString obj = new MethodsWithString();
		System.out.println(	obj.m1());
		
	}

}
