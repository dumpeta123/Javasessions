package javabasics;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		String s1 = "Hello";
		String s2 = "World";

		System.out.println(a + b);
		System.out.println(s1 + s2);
		System.out.println(a + b + s1 + s2);
		System.out.println(s1 + s2 + a + b);
		System.out.println("*************" + s1 + a + b + s2);
		System.out.println(s1 + a + b + s2);
		System.out.println(s1 + s2 + (a + b));
		System.out.println(a + b + s1 + s2 + a + s1 + b + s2);

		double c = 12.34;
		double d = 22.37;

		System.out.println(c + d + s1 + s2);
		System.out.println(c + s1 + s2 + d);
		System.out.println("*********" + a + b);
		System.out.print("*******" + (a + b) + "********");
		System.out.println(a);
		System.out.println(b);
		
		
	
	}

}
