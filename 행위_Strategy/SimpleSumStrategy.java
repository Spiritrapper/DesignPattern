package Strategy;

// 이클래스가 구현해야할 인터페이스 지정
public class SimpleSumStrategy implements SumStrategy{

    // 구현해야할 메소드 추가 
    @Override
    public int get(int N) {
        // 구현코드 추가
        int sum = N;

        for(long i=1; i<N; i++){
            sum +=1;
        }
        return sum;
    }
    
    
}
