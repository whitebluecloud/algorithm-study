package codility.prime;

import java.util.ArrayList;

/**
 * 55%... time out...
 *
 * https://app.codility.com/c/run/trainingWBR9E6-XJQ/
 *
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 *
 * A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.
 *
 * You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.
 *
 * Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.
 *
 * For example, consider an integer N = 26 and arrays P, Q such that:
 *
 *     P[0] = 1    Q[0] = 26
 *     P[1] = 4    Q[1] = 10
 *     P[2] = 16   Q[2] = 20
 * The number of semiprimes within each of these ranges is as follows:
 *
 * (1, 26) is 10,
 * (4, 10) is 4,
 * (16, 20) is 0.
 * Write a function:
 *
 * class Solution { public int[] solution(int N, int[] P, int[] Q); }
 *
 * that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.
 *
 * For example, given an integer N = 26 and arrays P, Q such that:
 *
 *     P[0] = 1    Q[0] = 26
 *     P[1] = 4    Q[1] = 10
 *     P[2] = 16   Q[2] = 20
 * the function should return the values [10, 4, 0], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..50,000];
 * M is an integer within the range [1..30,000];
 * each element of arrays P, Q is an integer within the range [1..N];
 * P[i] ≤ Q[i].
 */
public class CountSemiPrimes {

    public int[] solution(int N, int[] P, int[] Q) {

        boolean[] primeCheck = new boolean[N+1];
        primeCheck[1] = true;
        for (int i=2; i<=N; i++) {
            for(int j=2; i*j<N; j++){
                primeCheck[i*j] = true;
            }
        }


        int[] primeList = new int[N+1];
        for(int i=1; i<=N; i++){
            if(!primeCheck[i]) primeList[i] = 1;
        }

        ArrayList<Integer> semiPrimeList = new ArrayList<>();
        for(int i=0; i<primeList.length; i++){
            if(primeList[i] == 1){
                for(int j=0; j<primeList.length; j++){
                    if(primeList[j] == 1){
                        int temp = i*j;
                        if(temp > N) continue;
                        if(!semiPrimeList.contains(temp)){
                            semiPrimeList.add(temp);
                        }
                    }
                }
            }
        }
        int[] result = new int[P.length];
        for(int i=0; i<P.length; i++){
            int cnt = 0;
            for(int j: semiPrimeList){
                if(j >= P[i] && j <= Q[i]){
                    cnt++;
                }
            }
            result[i] = cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        CountSemiPrimes countSemiPrimes = new CountSemiPrimes();
        countSemiPrimes.solution(26, new int[]{1,4,16}, new int[]{26,10,20});
    }
}
