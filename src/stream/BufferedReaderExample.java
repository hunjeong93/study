package stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        long start = 0;
        long end = 0;

        FileInputStream fis1 = new FileInputStream("C:\\Users\\HunJeong\\Documents\\카카오톡 받은 파일\\cat2.gif");

        start = System.currentTimeMillis();
        while (fis1.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("사용하지 않았을 때: "+ (end-start) + "ms");
        fis1.close();

        FileInputStream fis2 = new FileInputStream("C:\\Users\\HunJeong\\Documents\\카카오톡 받은 파일\\cat2.gif");

        BufferedInputStream bis = new BufferedInputStream(fis2); // 버퍼 스트림 생성
        start = System.currentTimeMillis();
        while (bis.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("사용했을 때: " + (end - start) + "ms");
        bis.close();
        fis2.close();
    }
}
