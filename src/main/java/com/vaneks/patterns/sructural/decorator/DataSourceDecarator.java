package main.java.com.vaneks.patterns.sructural.decorator;

public class DataSourceDecarator implements DataSource{

    FileDataSource fileDataSource;

    public DataSourceDecarator(FileDataSource fileDataSource) {
        this.fileDataSource = fileDataSource;
    }

    @Override
    public String printData() {
        return fileDataSource.printData();
    }
}
