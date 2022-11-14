package section1;

public class FunctionalInterfaceExam {
    public static void main(String[] args) {
        FunctionalInter exam;
        exam = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        exam.accept(2);


        exam= (x) -> System.out.println(x * 4);
        exam.accept(3);


//        FuncitonalInter2 exam2;
//        exam2 = (x, y) -> {
//            int result = x + y;
//            return result;
//        };


    }



    @FunctionalInterface
    public interface FunctionalInter{
        public void accept(int x);



    }
    public interface FuncitonalInter2{
        public static int sum(int x, int y){
            return x + y ;
        }
    }
}
