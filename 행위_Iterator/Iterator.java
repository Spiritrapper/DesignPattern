package 행위_Iterator;
public interface Iterator {
    boolean next(); // Aggregator의 다음 구성데이터를 얻을수 있다면 true
    Object current(); // 구성데이터를 하나 얻어 반환 / 타입이 정해지지 않았기에 object타입으로 반환
}
