package programmers;

import java.util.PriorityQueue;

public class MoreHot {
    public static void main(String[] args) {
        int[] scoville = new int[]{1,2,3,9,10};
        int K = 7;

        int output = solution(scoville, K);
        System.out.println(output);
    }
    public static int solution(int[] scoville, int K) {

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }
        int firstSco = 0;
        int secondSco = 0;
        int mixSco = 0;
        int count = 0;
        while (heap.peek() < K) {
            if(heap.size() <=1) return -1;
            firstSco = heap.poll();
            secondSco = heap.poll();
            mixSco = firstSco + (secondSco * 2);
            heap.add(mixSco);
            count ++;
        }
        return count;
    }
}
