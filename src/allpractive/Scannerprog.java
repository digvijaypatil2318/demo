package allpractive;

import java.util.Scanner;

public class Scannerprog {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = scan.nextInt();
		System.out.println("Enter value of b:");
		int b= scan.nextInt();
		int c= a+b;
		System.out.println("addition of a and b is"+c);
		

	}

}
