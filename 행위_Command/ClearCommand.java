package Command;

public class ClearCommand implements Command {

    @Override
    public void run() {
        System.out.print("\033[H\033[2]");
        System.out.flush();
    }
    
}
