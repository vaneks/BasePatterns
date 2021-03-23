package main.java.com.vaneks.patterns.behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String string;

    public TerminalExpression(String string) {
        this.string = string;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(string)) {
            return true;
        }
        return false;
    }
}
