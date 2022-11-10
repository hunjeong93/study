package section1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        map.put("아구몬", 32);
        map.put("파피몬", 92);
        map.put("엔젤몬", 15);
        map.put("파닥몬", 27);
        map.put("디지몬", 85);

        System.out.println("총 entry 수 :" + map.size());

        System.out.println("엔젤몬:" + map.get("엔젤몬"));

        Set<String> keySet = map.keySet();

        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }

        map.remove("파닥몬");

        System.out.println("총 entry 수 :" + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);

        }
        map.clear();
    }
}
