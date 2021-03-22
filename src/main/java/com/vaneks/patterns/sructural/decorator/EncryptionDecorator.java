package main.java.com.vaneks.patterns.sructural.decorator;

public class EncryptionDecorator extends DataSourceDecarator {

    public EncryptionDecorator(FileDataSource fileDataSource) {
        super(fileDataSource);
    }
    public String encryptionData() {
        return " Data encrypted";
    }

    @Override
    public String printData() {
        return super.printData() + encryptionData();
    }
}
