package exercises;

public class SolveEquationTest {

	public static void main(String[] args) {
		double a = 2.00;
		double b = 6.00;
		double c = 4.00;
		double p1;
		double q1;
		double r1;
		double p2;
		double q2;
		double r2;
		
		p1 = (b*b) - (4*a*c);
		q1 = Math.sqrt(p1);
		r1 =  (-b + q1) / (2*a);
		
		System.out.println(r1);
		
		
		p2 = (b*b) - (4*a*c);
		q2 = Math.sqrt(p2);
		r2 = (-b - q2) / (2*a);
		
		System.out.println(r2);
		

	}

}
