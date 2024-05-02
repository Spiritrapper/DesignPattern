package 구조_Decorator;

public class BoxDecorator extends Decorator {

    public BoxDecorator(Item item) {
        super(item);
        //TODO Auto-generated constructor stub
    }
    
    

    @Override
    public int getLinesCount() {
        // TODO Auto-generated method stub
        return item.getLinesCount() + 2;
    }

    @Override
    public int getMaxLength() {
        // TODO Auto-generated method stub
        return item.getMaxLength() + 2;
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index) + 2;
    }

    @Override
    public String getString(int index) {
        int maxWidth = this.getMaxLength();
        if(index == 0 || index == getLinesCount() -1) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            for(int i=0; i<maxWidth-2; i++){
                sb.append('-');
            }
            sb.append('+');
            return sb.toString();
        } else {
            return '|' + item.getString(index-1)
                + makeTailString(maxWidth - getLength((index-1)));
        }
    }



    private String makeTailString(int count) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            sb.append(' ');
        } 
        sb.append('|');

        return sb.toString();
    }

    
}
