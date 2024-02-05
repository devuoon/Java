package TestCalc;

public class CalcTest06 {
	double a;
	double b;
	
	//생성자	
	CalcTest06(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	double plus() {
		double result = a + b;
		return result;
	}
	
	double min() {
		double result = a - b;
		return result;
	}
	
	double mul() {
		double result = a * b;
		return result;
	}
	
	double div() {
		double result = a / b;
		return result;
	}
}
