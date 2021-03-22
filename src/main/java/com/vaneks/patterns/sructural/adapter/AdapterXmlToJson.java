package main.java.com.vaneks.patterns.sructural.adapter;

public class AdapterXmlToJson extends JsonData implements  XmlData{

    @Override
    public void insert() {
        insertJson();
    }

    @Override
    public void read() {
        readJson();
    }

    @Override
    public void delete() {
        deleteJson();
    }

    @Override
    public void update() {
        updateJson();
    }
}
