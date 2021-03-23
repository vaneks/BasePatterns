package main.java.com.vaneks.patterns.behavioral.interpreter;

public class ProgramRun {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();
        System.out.println("This developers knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("This developers knows Java EE: " + isJavaEE.interpret("Java EE"));
    }
    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }
    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaEE = new TerminalExpression("Java EE");
        return new AndExpression(java, javaEE);
    }

}

