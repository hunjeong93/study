package section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringExam {
    public static void main(String[] args) throws Exception {
        List<String> names = Arrays.asList("김철수", "신짱구", "오유리", "야이바", "신짱구");

        names.stream()
                .distinct()//중복제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .forEach(n -> System.out.println(n));

        System.out.println("-".repeat(60));
        List<String> names2 = Arrays.asList("kimcoding", "javalee", "ingikim", "kimcoding");
        names2.stream()
                .map(s -> s.toUpperCase())
                .forEach(n->System.out.println(n));
    }
}
