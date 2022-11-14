package koplit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramSolution {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        int output = computeSumOfAllElements(list);
//        System.out.println(output);

//        List<Integer> list = Arrays.asList();
//        double output = computeAverageOfNumbers(list);
//        System.out.println(output);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = filterOddNumbers(list);
        System.out.println(output);

    }

    public static int computeSumOfAllElements(List<Integer> list){
        int sum = list.stream().mapToInt(x -> x).sum();

        return sum;
    }

    public static  double computeAverageOfNumbers(List<Integer> list) {
        if(list.size() ==0) return 0.0;
        double avg = list.stream().mapToInt(x -> x).average().getAsDouble();
        return avg;
    }
    public static List<Integer> filterOddNumbers(List<Integer> list){


        return  list.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
    }
}
