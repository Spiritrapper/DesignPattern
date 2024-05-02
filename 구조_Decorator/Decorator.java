package 구조_Decorator;

public abstract class Decorator extends Item{
    protected Item item;

    public Decorator(Item item) {
        this.item = item;
    }
    @Override
    public int getLinesCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLinesCount'");
    }

    @Override
    public int getMaxLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaxLength'");
    }

    @Override
    public int getLength(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    @Override
    public String getString(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getString'");
    }
    
}
