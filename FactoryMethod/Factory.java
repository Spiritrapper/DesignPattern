package FactoryMethod;

public abstract class Factory {
    public Item create(String name){
        boolean bCreatable = this.isCreateable(name);
        if(bCreatable) {
            Item item = this.createItem(name);
            postprocessItem(name);
            return item;
        }

        return null;
    }
    
    public abstract boolean isCreateable(String name);
    public abstract Item createItem(String name);
    public abstract void postprocessItem(String name);
    
}
