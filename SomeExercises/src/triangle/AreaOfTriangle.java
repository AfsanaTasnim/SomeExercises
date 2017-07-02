package triangle;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of x1:");
		double x1 = input.nextDouble();
		System.out.println("Enter the value of y1:");
		double y1 = input.nextDouble();
		System.out.println("Enter the value of x2:");
		double x2 = input.nextDouble();
		System.out.println("Enter the value of y2:");
		double y2 = input.nextDouble();
		System.out.println("Enter the value of x3:");
		double x3 = input.nextDouble();
		System.out.println("Enter the value of y3:");
		double y3 = input.nextDouble();
		
		double a = (x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2));
		double b = a/2;
		double c = Math.abs(b);System.out.println("Therefore the area of the triangle is: " + c);

	}

}
