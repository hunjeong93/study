package section1;


enum Height {
    BOTTOM, MIDDLE, TOP
}



public class EnumTest {
    public static void main(String[] args) {
        Height height = Height.MIDDLE;

        Height[] allHeight = Height.values();
        for (Height x : allHeight) {
            System.out.printf("%s=%d%n", x.name(), x.ordinal());

        }

        Height findHeight = Height.valueOf("BOTTOM");
        System.out.println(findHeight);
        System.out.println(Height.BOTTOM == Height.valueOf("BOTTOM"));

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
