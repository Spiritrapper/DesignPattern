package Proxy;

public class MainEntry {
    public static void main(String[] args) {
        //Display display = new ScreenDisplay(); 버퍼 사용대신 주석처리
        Display display = new BufferDisplay(3); // 마지막 2줄이 안나옴 추가

        display.print("안녕하세요.");  // 느린속도로 한줄씩나온느것을 확인 // bufferDisplay추가
        display.print("이해하기 나해한부분있지만");
        display.print("이해하고 개발에 적용하면");
        display.print("큰 규모 소프트웨어 개발에 도움됨");
        display.print("유지보수에");

        ((BufferDisplay)display).flush(); //버퍼 크기상관없이 모두출력
    }
}
