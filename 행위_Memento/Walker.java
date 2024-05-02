package 행위_Memento;

import java.util.ArrayList;

public class Walker {
    private int currentX, currentY; // 현재의 위치
    private int tartgetX, targetY;  // 목표 위치
    private ArrayList<String> actionList = new ArrayList<String>(); // 목표를 향해 액션취할때 순서대로 저장하기위 한 배열 객체

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.tartgetX = targetX;
        this.targetY = targetY;
    }
    
    public double walk(String action) { // action인자를 받아서 이동하는 메서드
        actionList.add(action);

        if(action.equals("UP")) {
            currentY +=1;
        } else if (action.equals("RIGHT")) {
            currentX +=1;
        } else if (action.equals("DOWN")) {
            currentY -=1;
        } else if (action.equals("LEFT")) {
            currentX -=1;
        }

        return Math.sqrt(Math.pow(currentX-tartgetX,2)+Math.pow(currentY-targetY,2));

    }

    public class Memento {
        private int x, y;
        private ArrayList<String> actionList;
        private Memento() {}
    }

    public Memento createMemento() {
        Memento memento = new Memento();

        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (ArrayList<String>)this.actionList.clone();

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = (ArrayList<String>)memento.actionList.clone();
    }

    @Override
    public String toString() {
        return actionList.toString();
    }
}


