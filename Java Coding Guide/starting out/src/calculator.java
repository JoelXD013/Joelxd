
public class calculator {
	double a;
	double b;
	//double result;
	
	public calculator() {} //Not need. Java has a default constructor
	
	public double sum(double a, double b) {
		return a + b;
	}
	public double dif(double a, double b) {
		return a - b;
	}
	public double pro(double a, double b) {
		return a * b;
	}
	public double quo(double a, double b) {
		return a / b;
	}
	public double exp(double a, double b) {
		return Math.pow(a, b);
	}
	public double frac(double a) {
		return 1 / a;
	}
	public double square(double a) {
		return Math.sqrt(a);
	}
}
	
