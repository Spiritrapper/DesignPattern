package Flyweight;

import java.util.ArrayList;

public class Number {
    private ArrayList<Digit> digitList = new ArrayList<Digit>(); //디지트 객체 저장 필드

    public Number(int number) { 
        String strNum = Integer.toString(number);//순차적으로 숫자를 가져오기위해 문자열로 변환했다가 다시 숫자로 입력
        int len = strNum.length();

        DigitFactory digitFactory = new DigitFactory();
        for(int i=0; i<len; i++) {
            int n = Character.getNumericValue(strNum.charAt(i)); // 정수로 변환
            Digit digit = digitFactory.getDigit(n);
            digitList.add(digit);
        }
    }

    public void print(int x, int y) {
        int cntDigits = digitList.size();
        for(int i=0; i<cntDigits; i++){
            Digit digit = digitList.get(i);
            digit.print(x+(i*8), y);
        }
    }
    
}
