package tax;

import java.util.Scanner;

public class IncomeTaxCalculatorTest {

	public static void main(String[] args) {
		
		IncomeTaxCalculator calculator = new IncomeTaxCalculator();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your income: ");
		double income = input.nextDouble();
		
		double tax = calculator.calculateTax(income);
		System.out.println("Your total income is: " + income);
		System.out.println("The amount of tax is: " + tax);
		
		
	}

}
