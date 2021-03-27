package main.java.com.vaneks.patterns.behavioral.interpreter;

public class ProgramRun {
    public static void main(String[] args) {
        Expression isHumanitarian = getHumanitarianExpression();
        Expression isNatural = getNaturalExpression();
        System.out.println("This student knows humanitarian sciences: " + isHumanitarian.interpret("English"));
        System.out.println("This student knows natural sciences: " + isNatural.interpret("Мaths and Physics"));
    }
    public static Expression getHumanitarianExpression() {
        Expression history = new TerminalExpression("History");
        Expression english = new TerminalExpression("English");
        return new OrExpression(history, english);
    }
    public static Expression getNaturalExpression() {
        Expression physics = new TerminalExpression("Physics");
        Expression maths = new TerminalExpression("Мaths");
        return new AndExpression(physics, maths);
    }

}

