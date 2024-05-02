package 구조_Decorator;

public class SideDecorator extends Decorator{
    private Character ch;

    public SideDecorator(Item item, Character ch) {
        super(item); //상속
        this.ch=ch;
    }

   
    @Override
    public int getLinesCount() {
        return item.getLinesCount();
    }

    @Override
    public int getMaxLength() {
        return item.getMaxLength() +2; // 문자한개씩을 더해서 반환
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index)+2;
    }


    @Override
    public String getString(int index) {
        return ch + item.getString(index) +ch;
    }
}
