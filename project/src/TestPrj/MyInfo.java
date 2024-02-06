package TestPrj;

public class MyInfo {

	public static void main(String[] args) {

		// 객체 생성
		Person myName = new Person("이윤지", "여자");
		// myName 객체의 myInfo 메서드를 호출하여 해당 객체의 정보를 출력
		myName.myInfo();
		
		Student mySchool = new Student("이윤지", "여자",1234, "부경대학교", 1);
		// mySchool 객체의 myInfo 메서드를 호출하여 해당 객체의 정보를 출력
		mySchool.myInfo();

		
	}

}
