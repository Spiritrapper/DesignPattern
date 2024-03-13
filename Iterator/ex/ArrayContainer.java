package Iterator.ex;

public class ArrayContainer {
    private int[] array;

    public ArrayContainer(int[] array) {
        this.array = array;
    }

    // 직접 배열을 반환하여 내부 구현을 노출
    public int[] getArray() {
        return array;
    }
}





