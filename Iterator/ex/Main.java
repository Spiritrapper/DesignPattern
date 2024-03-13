package Iterator.ex;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        ArrayContainer container = new ArrayContainer(data);

        // 직접 배열에 접근
        int[] array = container.getArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        ArrayContainer1 container1 = new ArrayContainer1(data);
        // Iterator를 사용하여 배열 순회
        for (int num : container1) {
            System.out.println(num);
        }
    
    }
}
