package codility;

import java.util.HashSet;

public class FrogRiverOne {

    public int solution(int X, int[] A){

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<A.length; i++){
            hashSet.add(A[i]);
            if(hashSet.size() == X) return i;
        }
        return -1;
    }
}
