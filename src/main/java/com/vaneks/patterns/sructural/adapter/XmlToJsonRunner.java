package main.java.com.vaneks.patterns.sructural.adapter;

public class XmlToJsonRunner {
    public static void main(String[] args) {

        XmlData xmlData = new AdapterXmlToJson();

        xmlData.insert();
        xmlData.read();
        xmlData.delete();
        xmlData.update();
    }
}
