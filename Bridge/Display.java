package Bridge;

public interface Display {

    void title(Draft draft); //제목을 출력한다는 기능에 대한 추상적 정의 // 출력한다는 메서드만을 선언 정의만내림 구현안함
    void author(Draft draft); // 이 메서드는 단순히 제목을 출력하는 역할만 하므로 반환할 값이 없기 때문에 void를 사용
    void content(Draft draft);
    
}
