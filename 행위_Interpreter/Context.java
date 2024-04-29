package Interpreter;

import java.util.StringTokenizer;

public class Context {
    private StringTokenizer tokenizer;
    private String currentkeyword;

    public Context(String script) {
        tokenizer = new StringTokenizer(script);
        readNextKeyword();
    }

    public String readNextKeyword() {
        if(tokenizer.hasMoreTokens()) {
            currentkeyword = tokenizer.nextToken();
        } else {
            currentkeyword = null;
        }

        return currentkeyword;
    }

    public StringTokenizer getTokenizer() {
        return tokenizer;
    }

    public String getCurrentkeyword() {
        return currentkeyword;
    }

   
}
