package codility;

import java.util.ArrayList;
import java.util.List;

public class TimeComplexityEx3 {

    public int solution(int[] A){
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<A.length; i++){
            sum += A[i];
            list.add(sum);
        }

        int min = Integer.MAX_VALUE;
        for(int n: list){
            int other = sum - n;
            int diff = Math.abs(other - n);
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {

    }
}