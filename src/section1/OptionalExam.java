package section1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExam {
    public static void main(String[] args) {
        List<String> lang = Arrays.asList(
                "Ruby", "Python", "Java", "Go", "Kotlin"
        );
        Optional<List<String>> listOptional = Optional.of(lang);

        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println(size);


    }


}
