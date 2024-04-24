package 구조_Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
    private ArrayList<String> data = new ArrayList<String>(); // 숫자를 표현할 데이터를 저장할 필드추가
    
    public Digit(String fileName) { //생성자작성 //생성자 인자로 파일명을(8줄문자열)
        FileReader fr = null;
        BufferedReader br = null;
        try { // 파일을 읽고 닫는 연산을 최소화 가장 중요한 최저고하
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            for(int i=0; i<8; i++) {
                data.add(br.readLine());
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null) fr.close();
                if(br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void print(int x, int y) {  // 화면상 XY위치의 파일을 읽어 데이터를 출력 메소드
        for(int i=0; i<8; i++) {
            String line = data.get(i);
            System.out.print(String.format("%c[%d;%df]",0x18,y+i,x));
            System.out.print(line);
        } 
    }
}    
