package codility;

import java.util.*;

public class ArrayEx2 {
    public int[] solution(int[] A, int K) {

        if(A.length == 0 || K == 0) return A;
        Deque<Integer> queue = new LinkedList<Integer>();

        Arrays.stream(A).forEach(a -> queue.addLast(a));

        for(int i=0; i<K; i++){
            queue.addFirst(queue.pollLast());
        }

        int[] result = queue.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public static void main(String[] args) {
        ArrayEx2 a = new ArrayEx2();
        a.solution(new int[]{3,8,9,7,6}, 3);
    }
}
