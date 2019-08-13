package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayEx1 {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: A){
            Integer tgt = map.get(n);
            if(tgt == null) {
                map.put(n, 1);
            }else{
                map.put(n, ++tgt);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
