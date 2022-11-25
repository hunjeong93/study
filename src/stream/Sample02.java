package stream;

import java.io.IOException;
import java.io.InputStream;

public class Sample02 {
    public static void main(String[] args) throws IOException {
        System.out.println("is 에 넣을 내용 입력 :");
        InputStream is = System.in;
        int asciiCode = is.read();
        char inputChar = (char) is.read(); // 아스키 코드를 읽고 문자로 리턴
        System.out.print(inputChar);

    }
}
