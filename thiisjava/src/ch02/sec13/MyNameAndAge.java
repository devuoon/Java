package ch02.sec13;

import java.util.Scanner;

public class MyNameAndAge {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름: ");
        String name = scanner.nextLine();

        if (name.equals("이윤지")) {
            System.out.println("나이: ");
            String strY = scanner.nextLine();
            int age = Integer.parseInt(strY);

            if (age == 28) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다.");
            }
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}
