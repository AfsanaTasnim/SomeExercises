package bodymassindex;

import java.util.Scanner;

public class BmiCalculatorTest {

	public static void main(String[] args) {
		BmiCalculator h = new BmiCalculator(0, 0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight: ");
		int weight = input.nextInt();
		h.setWeight(weight);
		
		System.out.println("Enter height");
		int height = input.nextInt();
		h.setHeight(height);
		
		double p = h.FindBmi(weight, height);
		
		System.out.println("The required BMI is: " + p + ".");

	}

}
