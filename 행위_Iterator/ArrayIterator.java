package 행위_Iterator;

public class ArrayIterator implements Iterator{
    private Array array; // array클래스의 객체를 필드로 참조해야하므로 
    private int index;

    public ArrayIterator(Array array) {
        this.array = array;
        this.index = -1;
    }

    // Iterator인터페이스의 메소드를 구현
    @Override
    public boolean next() {
        index++;
        return index < array.getCount();
    }    

    @Override
    public Object current() {
        return array.getItem(index); //array객체의 getItem을 통해 현재의 index값에 속하는 구성데이터 객체를 반환
    }
    
}
