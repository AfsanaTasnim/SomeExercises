package difficultproblems;

public class CelsiusToFahrenheit {
	private double celsius;
	
	public CelsiusToFahrenheit(double c) {
		celsius = c;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double c) {
		celsius = c;
	}
	
	public double CelsiusToFah(double celsius) {
		
		double fahrenheit = (((9.00 / 5.00) * celsius) + 32.00);
		
		
		return fahrenheit;
		
	}
	
	
}
