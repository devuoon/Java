package ch04.sec08;

import java.util.Scanner;

public class CalcTest03 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 숫자: ");
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.print("두 번째 숫자: ");
			int num2 = sc.nextInt();
			sc.nextLine();

			System.out.println("연산자를 입력하세요.");
			String str1 = sc.nextLine();

			if (str1.equals("+")) {
				System.out.println(num1 + num2);
			} else if (str1.equals("-")) {
				System.out.println(num1 - num2);
			} else if (str1.equals("*")) {
				System.out.println(num1 * num2);
			} else if (str1.equals("/")) {
				float num3 = num1 / num2;
				System.out.println(num3);
			}

			System.out.println("계속 진행할까요?");
			String quit = sc.nextLine();

			if (quit.equals("q")) {
				break;
			} else {
				continue;
			}
		}
		System.out.print("종료합니다.");
	}
}
