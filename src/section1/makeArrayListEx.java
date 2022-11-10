package section1;

import java.util.ArrayList;

public class makeArrayListEx {
    public static void main(String[] args) {
        System.out.println(Solution.makeArrayList());
    }
}

class Solution {
    public static ArrayList<Integer> makeArrayList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        return list;
    }
}