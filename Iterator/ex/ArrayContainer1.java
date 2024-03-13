package Iterator.ex;

import java.util.Iterator;

public class ArrayContainer1 implements Iterable<Integer> {
    private int[] array;

    public ArrayContainer1(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Integer next() {
            return array[index++];
        }
    }
}





