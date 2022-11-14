package section1;

import java.util.Arrays;

public class ReduceExam {
    public static void main(String[] args) throws Exception {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8};

        long sum = Arrays.stream(intArr).sum();
        System.out.println(sum);

        int sum1 = Arrays.stream(intArr)
                .map(el -> el*2)
                .reduce((a,b) -> a+b)
                .getAsInt();
        System.out.println(sum1);

        int sum2 = Arrays.stream(intArr)
                .map(el -> el * 2)
                .reduce(2, (a, b) -> a + b);
        System.out.println(sum2);
    }
}
