package 구조_Composition;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit {
    private LinkedList<Unit> unitList = new LinkedList<Unit>(); // Folder 클래스는 Unit 객체를 포함하는 LinkedList : has-a 관계

    public Folder(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }


    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> it = unitList.iterator();

        while(it.hasNext()) {
            Unit unit = it.next();
            size += unit.getSize();
        }
        
        return size;
    }

    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    private void list(String indent, Unit unit) {
        if(unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder)unit;
            Iterator<Unit> it = dir.unitList.iterator();
            System.out.println(indent + "+ " + unit);
            while(it.hasNext()) {
                list(indent + "   ", it.next());
            }
        }
    }

    public void list() {
        list("", this);
    }
    
}
