package project;

public class two {
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
		
		
		if(str1.equals( "+" ) ) {
			System.out.println(num1 + num2);
		} else if(str1.equals("-") ) {
			System.out.println(num1 - num2);
		} else if (str1.equals("*") ) {
			System.out.println(num1 * num2);
		} else if (str1.equals("/") ) {
			float num3 = num1 / num2;
			System.out.println(num3);
		}

}
