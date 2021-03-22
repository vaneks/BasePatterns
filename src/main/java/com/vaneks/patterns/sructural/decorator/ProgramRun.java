package main.java.com.vaneks.patterns.sructural.decorator;

public class ProgramRun {
    public static void main(String[] args) {
        DataSource dataSource = new EncryptionDecorator(new FileDataSource());
        System.out.println(dataSource.printData());
    }
}
