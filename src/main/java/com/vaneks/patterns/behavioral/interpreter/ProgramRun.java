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
        Expression javaCore = new TerminalExpression("English");
        return new OrExpression(history, javaCore);
    }
    public static Expression getNaturalExpression() {
        Expression java = new TerminalExpression("Physics");
        Expression javaEE = new TerminalExpression("Мaths");
        return new AndExpression(java, javaEE);
    }

}

