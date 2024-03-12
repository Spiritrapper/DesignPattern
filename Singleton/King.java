package Singleton;

public class King {
    private King(){} //private 객체생성 외부에서 생성 불가
    
    private static King self = null;  // King 객체 self는 유일참조변수

    public synchronized static King getInstance(){
        if(self == null) {
            self = new King();
        }
        return self;
        
    }

    public void say() {
        System.out.println("I am only one..");
    }
}
