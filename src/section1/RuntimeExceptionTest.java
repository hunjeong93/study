package section1;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        System.out.println("[대문자 알파벳을 소문자로 출력하는 프로그램]");
        printMyname("ABC");
        printMyname(null);
        System.out.println("[프로그램 종료]");
    }

    static void printMyname(String str) {
        String lowerCaseAlphabet = str.toLowerCase();
        System.out.println(lowerCaseAlphabet);
    }
}
//[대문자 알파벳을 소문자로 출력하는 프로그램]
//        abc
//        Exception in thread "main" java.lang.NullPointerException
//        at section1.RuntimeExceptionTest.printMyname(RuntimeExceptionTest.java:12)
//        at section1.RuntimeExceptionTest.main(RuntimeExceptionTest.java:7)
