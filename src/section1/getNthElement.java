package section1;

import java.util.ArrayList;

public class getNthElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(9);

        System.out.println( getNthElement(list,2));
    }

    static Integer getNthElement(ArrayList<Integer> arrayList, int index) {


        return arrayList.size() != 0 ? arrayList.get(index) : null;
    }
}


