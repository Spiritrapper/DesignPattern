package 행위_Iterator;

public class Array implements Aggregator {
    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    // 배열 인덱스를 통해 Item의 구성데이터를 가지고 올수 있는 getItem메소드생성
    public Item getItem(int index) {
        return items[index];
    }
    
    // 자리의 갯수를 얻을수 잇는 getCount
    public int getCount() {
        return items.length;
    }

    @Override
    public Iterator iterator() {

        return new ArrayIterator(this);
       }
}
