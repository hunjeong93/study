package section1;

import java.io.File;

public class FileExam {
    public static void main(String[] args) {
        File file = new File("../codestates.txt");

        System.out.println(file.getPath()); //..\codestates.txt
        System.out.println(file.getParent());//..
//        System.out.println(file.getCanonicalPath());
        System.out.println(file.canWrite());//false
    }
}
