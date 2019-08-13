package codility;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 91%...
 *
 * An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 *
 * For example, consider array A such that
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 *
 * Write a function
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 *
 * For example, given array A such that
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * the function may return 0, 2, 4, 6 or 7, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */
public class Dominator {
    public int solution(int[] A) {
        int[] rawA = A.clone();
        if(A.length == 0) return -1;
        if(A.length == 1 || A.length == 2) return 0;
        Arrays.sort(A);

        int mid = A.length / 2;
        int cnt = 0;
        for(int i=mid; i>0; i--){
            if(A[mid] == A[i]) cnt++;
            else break;
        }
        for(int i=mid+1; i<A.length; i++){
            if(A[mid] == A[i]) cnt++;
            else break;
        }
        if(cnt >= A.length / 2){
            for(int i=0; i<rawA.length; i++){
                if(rawA[i] == A[mid]){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Dominator dominator = new Dominator();
        System.out.println(dominator.solution(new int[]{3,4,3,2,3,-1,3,3}));
        System.out.println(dominator.solution(new int[]{0,0,1,1,1}));
    }
}
