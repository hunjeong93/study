package section1;

import java.io.FileOutputStream;

public class FileOutputStreamExam {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("codestates2.txt");
            String word = "code!!";

            byte b[] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
