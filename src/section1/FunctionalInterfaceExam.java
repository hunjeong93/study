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

//        exam = (x, y) -> {
//            int result = x + y;
//            return result;
//        }; 아직 잘 모르겠음. 사용법 확인할 것


    }



    @FunctionalInterface
    public interface FunctionalInter{
        public void accept(int x);
//        public static int sum(int x, int y){
//            return x + y ;
//        }

    }
}
