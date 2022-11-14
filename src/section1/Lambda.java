package section1;



public class Lambda {
    public static void main(String[] args) {

        ExampleFucntion exampleFunction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFunction.sum(10,15));

    }
}

@FunctionalInterface
interface ExampleFucntion{
    public abstract int sum(int num1, int num2);
}
