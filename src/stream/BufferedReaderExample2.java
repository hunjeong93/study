package stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample2 {
    public static void main(String[] args) throws Exception {

        InputStream is = System.in;
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader); //버퍼스트림생성

        System.out.println("입력 :");
        String lineString = br.readLine();

        System.out.println("출력 :" + lineString);
    }
}
