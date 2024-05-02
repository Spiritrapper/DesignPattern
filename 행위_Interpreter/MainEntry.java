package 행위_Interpreter;

public class MainEntry {
    public static void main(String[] args) {
        String script1 = "BEGIN FRONT LOOP 2 BACK RIGHT END BACK END";
        String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";

        Context context = new Context(script);
        Expression expression = new BeginExpression();

        if(expression.parse(context)) {
            System.out.println(expression);
            expression.run();
        }
        // while(true) {
        //     String keyword = context.getCurrentkeyword();
        //     if(keyword == null ) break;

        //     System.out.println(keyword);

        //     context.readNextKeyword();
        // }
    }
}
