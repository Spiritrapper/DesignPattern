package 행위_Interpreter;

public interface Expression {
    boolean parse(Context context);
    boolean run();
    
}
