package section1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ComparatorExam {
    public static void main(String[] args) {
        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"}
        );

//        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);
        stringArraysStream.map(Arrays::stream).forEach(System.out::println);

        List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

        list.stream()
                .sorted()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));
    }
}
