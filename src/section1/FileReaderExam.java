package section1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {
    public static void main(String args[]) {
        try {
            String fileName = "codestates.txt";
            FileReader file = new FileReader(fileName);
//            FileInputStream file = new FileInputStream(fileName);
            BufferedReader buffred = new BufferedReader(file);

            int data = 0;

            while((data=buffred.read()) != -1) {
                System.out.print((char)data);
            }
            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
