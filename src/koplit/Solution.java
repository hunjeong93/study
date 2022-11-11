package koplit;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

//       21번 문제
//        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>() {
//            {
//                put("apple", Arrays.asList("apple", "red"));
//                put("banana", Arrays.asList("delicious"));
//            }
//        };
//
//        String str = "apple";
//        String output = getElementOfListEntry(hashMap, str, 1);
//        System.out.println(output);


//        HashMap<String, String> member = new HashMap<String, String>(){{
//            put("kimcoding", "1234");
//            put("parkhacker", "qwer");
//        }};
//
//        boolean output = isMember(member, "parkhacker", "qwer");
//        System.out.println(output);

//        HashMap <String,Integer> newHashMap = new HashMap<>();

//        String[] arr = {"a", "c", "e"};
//        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
//            put("a", 1);
//            put("b", 2);
//            put("c", 3);
//        }};
//        HashMap<String, Integer> output = select(arr, hashMap);
//        System.out.println(output);


//        String str = "banana";
//        HashMap<Character, Integer> output = countAllCharacter(str);
//
//        System.out.println(output);

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(){{
            put('a', 1);
            put('b', 4);
            put('c', 6);
            put('d', 9);
        }};
        int output = addOddValues(hashMap);
        System.out.println(output);

    }

    private static int addOddValues(HashMap<Character, Integer> hashMap) {
        Set<Character> set = hashMap.keySet();
        Iterator<Character> iterator = set.iterator();
        int sum =0;
        while(iterator.hasNext()){
            Character ch = iterator.next();
            Integer su = hashMap.get(ch);
            if(su % 2 == 0){
                sum += su;
            }
        }return sum;
    }

    private static HashMap<Character, Integer> countAllCharacter(String str) {

        if(str.length() ==0) return null;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for( int i =0; i <str.length(); i++){
            char c = str.charAt(i);
            if(hashMap.containsKey(c)) {
                int value = hashMap.get(c);
                hashMap.put(c, value+1);
            }else {
                hashMap.put(c,1);
            }

        }
        return hashMap;
    }



    public static HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {

        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        HashMap<String, Integer> newHashMap = new HashMap<>();
        while(iterator.hasNext()){
            String key = iterator.next();
            String str;
            for(int i=0; i < arr.length; i++){
                str = arr[i];
               if (hashMap.containsKey(str)){
                   newHashMap.put(str, hashMap.get(str));
               }
            }

        }return  newHashMap;
    }


    public static boolean isMember(HashMap<String, String> member, String username, String password) {
        if(member.get(username)==null) return false;


        return member.get(username).equals(password);
    }



    public static  String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {

        List<String> valueList = hashMap.get(key);
        return valueList.get(index);
    }

}