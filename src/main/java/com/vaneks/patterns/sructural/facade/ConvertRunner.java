package main.java.com.vaneks.patterns.sructural.facade;

public class ConvertRunner {
    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        videoConverter.convert("mpeg4");
    }
}
