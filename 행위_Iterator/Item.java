package 행위_Iterator;
public class Item {
    private String name;
    private int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // toString으로 재정의
    @Override
    public String toString() {
        return "(" + name + "," +cost + ")" ;
    }


}
