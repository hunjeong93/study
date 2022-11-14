package section1;

import java.util.List;

public class DeclarativeProgramingExam {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 8, 11, 15);

        int sum =
                numbers.stream()
                        .filter(number -> number > 4 && (number % 2 == 0))
                        .mapToInt(number -> number)
                        .sum();

        System.out.println("# 선언형  프로그래밍 :" + sum);
    }
}
