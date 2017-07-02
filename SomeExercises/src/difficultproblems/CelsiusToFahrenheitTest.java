package difficultproblems;

import java.util.Scanner;

public class CelsiusToFahrenheitTest {

	public static void main(String[] args) {
		CelsiusToFahrenheit h = new CelsiusToFahrenheit(0.0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius scale: ");
		double celsius = input.nextDouble();
		h.setCelsius(celsius);
		
		System.out.println("The required temperature in fahrenheit scale is: " + h.CelsiusToFah(celsius) + ".");

	}

}
