package tax;

public class IncomeTaxCalculator {
	public double calculateTax(double income) {
		
		double tax = 0.0;
		
		if(income == 250000) 
			tax = 0;
		if(income > 250000 & income <= 650000)
			tax = 0.1 * income;
		if(income > 650000 & income <= 1150000)
			tax = 0.15 * income;
		if(income > 1150000 & income <= 1750000)
			tax = 0.20 * income;
		if(income > 1750000 & income <= 4750000)
			tax = 0.25 * income;
		if(income > 4750000)
			tax = 0.30 * income;
		
		return tax;
	}
}
