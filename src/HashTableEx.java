import java.util.*;

public class HashTableEx {
    public static void main(String[] args) {

        Hashtable<String, String> map = new Hashtable<String, String>();

        map.put("abcd", "1234");
        map.put("def", "567");
        map.put("ice", "333");
        map.put("newyork", "999");
        System.out.println(map);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비번 입력 ");
            System.out.println("아이디 :");
            String id = sc.nextLine();

            System.out.println("비밀번호 :");
            String pass = sc.nextLine();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pass)) {
                    System.out.println("로그인 됬음");
                    break;
                }
                else System.out.println("비밀번호 틀림");
            }
            else System.out.println("아이디 틀림");
        }
    }
}
