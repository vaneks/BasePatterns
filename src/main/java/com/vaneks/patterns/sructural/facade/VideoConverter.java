package main.java.com.vaneks.patterns.sructural.facade;

public class VideoConverter {
    MPEG4CompressionCodec mpeg4CompressionCodec = new MPEG4CompressionCodec();
    MPEG2CompressionCodec mpeg2CompressionCodec = new MPEG2CompressionCodec();
    H264CompressionCodec h264CompressionCodec = new H264CompressionCodec();

    public void convert(String format) {
        if (format.equals("mpeg4")) {
            mpeg4CompressionCodec.compression();
        }
        if (format.equals("mpeg2")) {
            mpeg2CompressionCodec.compression();
        }
        if (format.equals("h264")) {
            h264CompressionCodec.comression();
        }
    }
}
