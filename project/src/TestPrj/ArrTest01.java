package TestPrj;

public class ArrTest01 {
	public static void arrPrint(int[] a /*매개변수*/) {	// int타입의 배열을 선언
		for (int i = 0; i<a.length; i++) {
			System.out.println("a[" + i + "] :" + a[i]);
		}
	}
	 
	public static void main(String[] args) {

		int[] ary = { 10, 20, 30, 40, 50 }; // 배열선언과 동시에 초기화

		for (int i = 0; i <= ary.length; i++) { 	//ary.length : 배열의 길이를 통해 값 구하기
			// System.out.printf("ary[%d]: %d\n", i,ary[i]); //%d : 정수 형식 표기법
			System.out.println("ary[" + i + "] : " + ary[i]);
		}

		int ary1[]; // 배열 선언 (= int[] ary;), 메모리 할당 단계 x
		ary1 = new int[] { 50, 60, 70, 80, 90, 100 }; // 선언 후 배열 초기화 하기

		for (int i = 0; i <= 5; i++) {
			System.out.println("ary1[" + i + "] :" + ary1[i]);
		}
		
		/*별도의 클래스에서 메서드 생성 하면 메인에 호출 해야함*/
		arrPrint(new int[] {1,2,3});		//별도의 배열 객체 생성
		arrPrint(ary);						//배열 ary을 전달 
		
	}
}