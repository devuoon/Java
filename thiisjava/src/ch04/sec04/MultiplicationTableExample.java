package ch04.sec04;

import java.util.Scanner;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요?");
		int num = sc.nextInt();
	     sc.nextLine();
	     for(int n=1; n<=9; n++) {
				System.out.println(num + "x" + n + "=" + num*n);
			}
	     
	}
}
