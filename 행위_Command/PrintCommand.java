package 행위_Command;

public class PrintCommand implements Command{
    private String content;


    public PrintCommand(String conteString) {   
        this.content = content;
    }


    @Override
    public void run() {
        System.out.println(content);
    }
    
}
