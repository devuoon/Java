package TestClass;


class CarOne {
	String kind = "세단";
	String modeName;
	String carColor;
	int carYear;
}

public class CreatCarOne {
	public static void main(String[] args) {
		CarOne c1 = new CarOne();
		CarOne c2 = new CarOne();
		
		System.out.println(c1.kind);
		System.out.println(c1.kind);
	}
}
