package section1;

public class FuntionalInter {
    public static void main(String[] args) {
        FuntionalInter2 exam;
        exam = () -> {
            String str = "first!";
            System.out.println(str);
        };
        exam.accept();

        exam = () -> System.out.println("second!");
        exam.accept();
    }


@FunctionalInterface
public interface FuntionalInter2 {
    public void accept();
}
}