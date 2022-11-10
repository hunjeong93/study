package section1;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        try {
            System.out.println("[대문자 알파벳을 소문자로 출력하는 프로그램]");
            printMyname("ABC");
            printMyname(null);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생!");
        } catch (NullPointerException e) {
            System.out.println("NullpointerException 발생!");
            System.out.println("e.getMessage:" + e.getMessage());
            System.out.println("e.toString:" + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("[프로그램 종료]");
        }
    }

    static void printMyname(String str) {
        String lowerCaseAlphabet = str.toLowerCase();
        System.out.println(lowerCaseAlphabet);
    }
}
//[대문자 알파벳을 소문자로 출력하는 프로그램]
//        abc
//        NullpointerException 발생!
//        e.getMessage:null
//        e.toString:java.lang.NullPointerException
//        [프로그램 종료]
//        java.lang.NullPointerException
//        at section1.RuntimeExceptionTest2.printMyname(RuntimeExceptionTest2.java:23)
//        at section1.RuntimeExceptionTest2.main(RuntimeExceptionTest2.java:8)
