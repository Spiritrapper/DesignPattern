package Strategy;

public class SumPrinter {
    // n까지의 총합을 출력하는 프린트메소드
    void print(SumStrategy strategy, int N){
        //메세지
        System.out.printf("The sum of 1 - %d :", N);
        //총합
        System.out.println(strategy.get(N));
    }
}