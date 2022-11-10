package section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String> ();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("C")) {
                System.out.println(str);
                iterator.remove();
            }
        }
        System.out.println("-".repeat(30));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
