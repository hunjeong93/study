package section1;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
    public static void main(String[] args) {
        try {
            String fileName = "codestates2.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "written!!";
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
