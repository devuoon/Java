package ch02.sec11;

public class PrintTest {
	public static void main(String[] args) {
		String name = "이윤지";
		int age = 28;
		
		System.out.println("나의 이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		System.out.printf("나의 이름은 %s이고 나이는 %d살 입니다.", name, age);
	}
}
