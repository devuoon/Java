package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		 char gender = ssn.charAt(6);
		 
		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}
	}
}
