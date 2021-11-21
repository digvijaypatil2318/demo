package allpractive;

public class ReverseArray {

	public static void main(String[] args) {
         String a="Amit Patil";
		
		String [] abc= {"java","selenium","testing"};
		
		String d=abc[1];
		
		for(int i=d.length()-1;i>=0;i--)
		{
			System.out.print(d.charAt(i));
		}
	}

}
