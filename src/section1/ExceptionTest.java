package section1;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Exception intededException = new Exception("의도된 예외 만들기");
            throw intededException;
        } catch (Exception e) {
            System.out.println("고의로 예외 발생시키기");
        }
    }
}
