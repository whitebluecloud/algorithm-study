package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCounters {

    public int[] solution(int N, int[] A) {

        int max = 0;
        int doneMax = 0;
        int[] result = new int[N];

        for(int i=0; i<A.length; i++){
            if(A[i] <= N){
                if(result[A[i]-1] < doneMax){
                    result[A[i]-1] = doneMax;
                }
                result[A[i]-1] += 1;
                if(result[A[i]-1] > max) max = result[A[i]-1];
            }else{
                doneMax = max;
            }
        }

        for(int i=0; i<result.length; i++){
            if(result[i] < doneMax){
                result[i] = doneMax;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
