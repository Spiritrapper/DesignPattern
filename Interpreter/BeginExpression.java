package Interpreter;

public class BeginExpression implements Expression {
    private CommandListExpression expression;

    @Override
    public boolean parse(Context context) {
        if(checkValidKeyword(context.getCurrentkeyword())) {
            context.readNextKeyword();
            expression = new CommandListExpression(); // BEGIN과 END사이 구문을 담을 객체 생성
            return expression.parse(context);
        }else {
            return false;
        }
    }

    @Override
    public boolean run() {
        return expression.run();
    }

    public static boolean checkValidKeyword(String keyword) {
        return keyword.equals("BEGIN");
    }

    @Override
    public String toString() {
        return "BEGIN" + expression;
    }
    
}
