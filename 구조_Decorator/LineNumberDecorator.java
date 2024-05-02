package 구조_Decorator;

public class LineNumberDecorator extends Decorator {

    public LineNumberDecorator(Item item) {
        super(item);
        //TODO Auto-generated constructor stub
    }

   
    @Override
    public int getLinesCount() {
        // TODO Auto-generated method stub
        return item.getLinesCount();
    }

    @Override
    public int getMaxLength() {
        // TODO Auto-generated method stub
        return item.getMaxLength() + 4;
    }

    @Override
    public int getLength(int index) {
        // TODO Auto-generated method stub
        return item.getLength(index) + 4;
    }


    @Override
    public String getString(int index) {
        // TODO Auto-generated method stub
        return String.format("%02d",index) + ": " + item.getString(index);
    }
    
}
