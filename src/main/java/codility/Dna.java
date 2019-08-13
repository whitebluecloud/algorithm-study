package codility;

import java.util.*;
import java.util.stream.Stream;

// timeout 남..
public class Dna {

    public int[] solution(String s, int[] P, int[] Q){

        int[] result = new int[P.length];

        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("C",2);
        map.put("G",3);
        map.put("T",4);

        char[] sArr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<sArr.length; i++){
            int temp = map.get(String.valueOf(sArr[i]));
            list.add(temp);
        }
        for(int i=0; i<P.length; i++){
            result[i] = Collections.min(list.subList(P[i], Q[i]+1));
        }
        return result;
    }

    public static void main(String[] args) {

        Dna dna = new Dna();
        System.out.println(dna.solution("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6}));
    }
}
