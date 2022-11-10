package section1;

public class RuntimeErrorTest {
    public static void main(String[] args) {
        System.out.println(4 * 4);
        System.out.println(4 / 0); // 에러 발생
    } //Exception in thread "main" java.lang.ArithmeticException: / by zero
   // at section1.RuntimeErrorTest.main(RuntimeErrorTest.java:6)
}
