package TestPrj;

public class Student extends Person {
	//인스턴스 필드 선언
    int sId;
    String school;
    int grade;
    
    //생성자 선언
    public Student(String name, String gender, int sId, String school, int grade) {
    	//부모 생성자 선언
    	super(name, gender);
        this.sId = sId;
        this.school = school;
        this.grade = grade;
    }
    
    @Override
    //부모 클래스를 오버라이딩 하는 메소드 정의
    void myInfo() {
    	System.out.printf("나는 %s %d학년에 재학중이고 학번은 %d %s %s 입니다.", school, grade, sId, gender, name);
    }
}
