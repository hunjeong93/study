package section1;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("bacon");
        arrayList.add("cheese");
        arrayList.add("hamburger");

        int size = arrayList.size();

        String gradient = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            System.out.println(i + ":" + str);

        }

        for (String str : arrayList) {
            System.out.println(str);
        }
        arrayList.remove(0);
        System.out.println("-".repeat(20));
        System.out.println(arrayList.get(0));
    }

}
