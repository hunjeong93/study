package section1;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> person = new TreeSet<>();

//        person.add("김 철수");
//        person.add("신 짱구");
//        person.add("김 훈");
//        person.add("문 상훈");
//
//        System.out.println(person);
//        System.out.println(person.first());
//        System.out.println(person.last());
//        System.out.println(person.higher("김"));
//        System.out.println(person.subSet("김", "문"));

        person.add("Lee");
        person.add("Park");
        person.add("Kim");

        System.out.println(person); // 배열 리턴
        System.out.println(person.first());
        System.out.println(person.last());
        System.out.println(person.higher("Lee")); //Lee 다음
        System.out.println(person.subSet("Kim", "Park")); // Kim부터 Park 전까지

    }
}
