package Flyweight;

public class DigitFactory { // 누군가 원하는 숫자를 디지트객체에 요청하면 해당 객체를 전달해주는 기능담당
    private Digit[] pool  = new Digit[] { // 10개의 디지트 객체를 담을수 있는 배열 추가
        null, null, null, null, null
    };

    public Digit getDigit(int n) { //이 메서드는 인자로 어떤 숫자값(int n)을 받아서 해당 숫자 값에 해당되는 디지트를 전달하는 기능 
        if(pool[n] != null) { // pool필드에 해당하는 객체가 null이 아니라면?
            return pool[n];
        } else { // null이라면 디지트 객체 생성 저장 반환
            String fileName = String.format("./data/%d.txt", n);
            Digit digit = new Digit(fileName);
            pool[n] = digit;
            return digit;
        }
    }
}
