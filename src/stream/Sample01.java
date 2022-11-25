package stream;


import java.io.*;
import java.util.Arrays;

public class Sample01 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/Users/HunJeong/test.txt");
        int readCharNo;
        char[] cbuf = new char[6];
        while((readCharNo=reader.read(cbuf)) != -1);

        for (int i = 0; i < cbuf.length; i++) {
            System.out.println("cbuf[" + i + "]: " + cbuf[i]);

        }


        InputStream is = new FileInputStream("C:/Users/HunJeong/test.txt");
        int readByteNo;
        byte[] readBytes = new byte[6];
        while ((readByteNo = is.read(readBytes)) != -1);

        for (int i = 0; i < readBytes.length; i++) {
            System.out.println("readByteNo[" + i + "]: " + readBytes[i]);
        }

    }
}
