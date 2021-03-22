package main.java.com.vaneks.patterns.sructural.decorator;

public class FileDataSource implements DataSource{
    @Override
    public String printData() {
        return "Print FileDataSource";
    }
}
