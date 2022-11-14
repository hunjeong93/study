package section1;

import java.util.ArrayList;
import java.util.Arrays;

public class MatchesExam {
    public static void main(String[] args) throws Exception {
        int[] intArr = {3, 6, 9, 12};
        boolean result = Arrays.stream(intArr).allMatch(a -> a % 3 == 0);
        System.out.println("모두 3의 배수인가?" + result);

        result = Arrays.stream(intArr).anyMatch(a ->a %2 == 0);
        System.out.println("하나라도 2의 배수가 있는가?" + result);


        result = Arrays.stream(intArr).noneMatch(a -> a % 5 == 0);
        System.out.println("5의 배수가 없는가? "+result);
    }
}
