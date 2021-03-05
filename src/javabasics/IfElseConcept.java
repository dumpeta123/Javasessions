package javabasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a = 12;
		int b = 20;

		if (a > b) {
			System.out.println("a is greater than b ");

		} else {
			System.out.println("b is greater than a");
		}

		// Comparison

		int c = 30;
		int d = 40;

		if (c == d) {
			System.out.println("c and d are equal");
		} else {
			System.out.println("c and d are not equal");
		}

		// nested IF

		int x = 100;
		int y = 200;
		int z = 300;

		if (x > y & x > z) {

			System.out.println("x is the greatest");

		} else if (y > z) {
			System.out.println("y is the greatest");

		} else {
			System.out.println("z is the greatest");
		}
	}

}
