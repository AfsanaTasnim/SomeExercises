package bodymassindex;

public class BmiCalculator {
	private int weight;
	private int height;
	
	public BmiCalculator(int w, int h) {
		weight = w;
		height = h;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public double FindBmi(int weight, int height) {
		double bmi;
		bmi = (weight / (height * height));
		
		return bmi;
	}
}
