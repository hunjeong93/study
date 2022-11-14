package section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLambdaExam {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("곽훈정", 100),
                new Student("깡깡이", 30)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - "+score);
        });
    }
}
