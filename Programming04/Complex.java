package Programming04;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real) {
		this(real, 0.0);
	}
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public void print() {
		System.out.println(real + " + " + imaginary + "i");
	}
}
