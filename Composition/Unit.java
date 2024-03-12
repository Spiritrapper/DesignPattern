package Composition;

public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;

    }

    @Override
    public String toString() {
        return name + "(" + getSize() + ")";
    }

    public abstract int getSize(); // 파일과 폴더에 대해서 각각 다르기때문에 추상메소드로 
}
