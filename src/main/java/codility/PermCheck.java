package codility;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {

        if(A == null) return 0;
        int sum = 0;
        boolean[] check = new boolean[A.length+1];
        for(int i=0; i<A.length; i++){
            sum +=A[i];

            if(A[i] > A.length) return 0;
            check[A[i]] = true;
        }
        for(int i=1; i<A.length+1; i++){
            if(check[i] == false) return 0;
        }


        int sum2 = 0;
        for(int i=1; i<A.length+1; i++){
            sum2 += i;
        }
        return sum - sum2 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[]{4,1,3,2}));
    }
}
