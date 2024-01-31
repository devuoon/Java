package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		int totalPieces = apple * 10;
		int result2 = totalPieces - number;
		System.out.println("10조각에서 남은 조각: " + result2);
		System.out.println("사과 1개에서 남은 양: " + result2/10.0);
		
	}
}
