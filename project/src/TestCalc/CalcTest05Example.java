package TestCalc;

import java.util.Scanner;

public class CalcTest05Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.println("숫자를 입력하세요.");
		int y = sc.nextInt();
		sc.nextLine();
		
		CalcTest05 c = new CalcTest05(x, y);
		
		int res1 = c.plus();
		System.out.println(res1);
		int res2 = c.min();
		System.out.println(res2);
		int res3 = c.mul();
		System.out.println(res3);
		int res4 = c.div();
		System.out.println(res4);
	}
}
