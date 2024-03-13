package Singleton;

public class King {
    private King(){} //private 객체생성 외부에서 생성 불가 // King king = new King(); //에러 불가

    private static King self = null;  // King 객체 self는 유일참조변수  static사용해서 class이름으로 접근가능

    public synchronized static King getInstance(){
        if(self == null) {
            self = new King(); // 클래스 내부에서만 객체생성 가능
        }
        return self;
        
    }

    public void say() {
        System.out.println("I am only one..");
    }
}
