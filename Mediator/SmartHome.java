package Mediator;

public class SmartHome implements Mediator{
    public Door door = new Door(this);
    public Window window = new Window(this);
    public CoolAircon coolAircon = new CoolAircon(this);
    public HeatBoiler heatBoiler = new HeatBoiler(this);



    @Override
    public void participantChanged(Participant participant) { //개발시 변경이 많은곳은 한곳에 집중
        if(participant== door && !door.isCloased()) {
            coolAircon.off();
            heatBoiler.off();
        }
        if(participant== window && !window.isCloased()) {
            coolAircon.off();
            heatBoiler.off();
        }
        if(participant == coolAircon && coolAircon.isRunning()) {
            heatBoiler.off();
            window.close();
            door.close();
        }

        if(participant == heatBoiler && heatBoiler.isRunning()) {
            coolAircon.off();
            window.close();
            door.close();
        }
    }

    public void report() {
        System.out.println("\033[H\033[2J[집안상태]"); // java에서 콘솔지우기
        System.out.println(door);
        System.out.println(window);
        System.out.println(coolAircon);
        System.out.println(heatBoiler);
        System.out.println();
    }
    
}
