package TestShape;

class Car {
    Model model;
    void drive() {
        model.run();
    }
}

class Model{
    void run() {
        System.out.println("차가 달린다.");
    }
}

class Avante extends Model {
    @Override
    void run() {
        System.out.println("아반떼가 달린다.");
    }
}

class Ramborghini extends Model {
    @Override
    void run() {
        System.out.println("람보르기니가 달린다.");
    }
}

class Bentley extends Model {
    @Override
    void run() {
        System.out.println("벤틀리가 달린다.");
    }
}

public class PolyClass {
    public static void main(String[] args) {
        // 객체 생성
        Car c = new Car();

        //c의 모델을 아반떼로 설정하고, drive 메소드를 호출
        c.model = new Avante();
        c.drive();
        
      //c의 모델을 벤틀리로 설정하고, drive 메소드를 호출
        c.model = new Bentley();
        c.drive();
        
      //c의 모델을 람보르기니로 설정하고, drive 메소드를 호출
        c.model = new Ramborghini();
        c.drive();
    }
}
