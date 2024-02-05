package TestCalc;

import java.util.Scanner;

public class CalcTest04 {
	public static void plus(int num1, int num2) {
		System.out.print("num1 + num2 =" + ( num1 + num2));
	}
	public static void minus(int num1, int num2) {
		System.out.print("num1 - num2 =" + ( num1 - num2));
	}
	public static void multi(int num1, int num2) {
		System.out.print("num1 * num2 =" + ( num1 * num2));
	}
	public static void div(int num1, int num2) {
		System.out.print("num1 / num2 =" + ( num1 / num2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		 
		System.out.println("연산자를 입력하세요.");
		String str1 = sc.nextLine();
		
		if(str1.equals("+") ) {
			plus(num1,num2);
		} else if(str1.equals("-")) {
			minus(num1,num2);
		} else if(str1.equals("*")) {
			multi(num1,num2);
		} else if(str1.equals("/")) {
			div(num1,num2);
		}
	}
}
