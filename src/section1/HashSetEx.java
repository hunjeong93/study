package section1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> lang = new HashSet<String>();

        lang.add("korean");
        lang.add("japanese");
        lang.add("english");
        lang.add("france");
        lang.add("korean"); //중복

        Iterator it = lang.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
