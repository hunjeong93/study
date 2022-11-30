package programmers;

import java.util.HashMap;
import java.util.Set;

public class fakeWear {
    public static void main(String[] args) {
        String[][] arr = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        System.out.println(solution(arr));
    }

    public static int solution(String[][] clothes) {
        int answer = 1; //곱셈을 위해 1로 선언
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        //map 구하기
        for(int i =0; i<clothes.length; i++){
            //의상종류, 갯수
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        //조합
        Set<String> keySet = clothesMap.keySet(); //의상종류.

        for(String key : keySet) {
            answer *= clothesMap.get(key)+1;
        }
        return answer-1;
    }
}
