

enum Height {
    BOTTOM, MIDDLE, TOP
}


public class Main {
    public static void main(String[] args) {
        Height height = Height.MIDDLE;

        switch (height) {
            case BOTTOM:
                System.out.println("바닥");
                break;
            case MIDDLE:
                System.out.println("중간");
                break;
            case TOP:
                System.out.println("뚜껑");
                break;

        }
    }

}