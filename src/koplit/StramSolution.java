package koplit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramSolution {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        int output = computeSumOfAllElements(list);
//        System.out.println(output);

//        List<Integer> list = Arrays.asList();
//        double output = computeAverageOfNumbers(list);
//        System.out.println(output);


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> output = filterOddNumbers(list);
//        System.out.println(output);


//        int[] arr = {1, 10, 5, 32, 5};
//        Integer output = findBiggestNumber(arr);
//        System.out.println(output);

//        List<String> list1 = Arrays.asList("김코딩", "박해커");
//        List<String> list2 = Arrays.asList("최자바", "이스프링");
//        List<String> output = mergeTwoStream(list1, list2);
//        System.out.println(output);

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> output = makeElementDouble(list);
//        System.out.println(output);

        int[] temperature = {25, 29, 30, 31, 26, 30, 33};
        boolean output = isHot(temperature);
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

    public static Integer findBiggestNumber(int[] arr) {
        return arr.length == 0 ? null : Arrays.stream(arr).max().orElse(0);
    }

    public static List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        //TODO..
        List<String> result =
                Stream.concat(list1.stream(), list2.stream())
                        .collect(Collectors.toList());

        return result;
    }
    public static List<Integer> makeElementDouble(List<Integer> list) {
        //TODO..
        List<Integer> result =
                list.stream()
                        .map(n -> n *2)
                        .collect(Collectors.toList());
        return result;
    }

    public static boolean isHot(int[] temperature) {
        //TODO..
        if(temperature.length != 7) return false;
        long result =
                Arrays.stream(temperature)
                        .filter(n -> n >= 30)
                        .count();



        if (result >= 3) return true;
        else return false;
    }
}
