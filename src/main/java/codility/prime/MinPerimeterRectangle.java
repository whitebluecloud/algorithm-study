package codility.prime;

/**
 *
 *
 * 일부 직사각형의 영역을 나타내는 정수 N이 주어진다.
 *
 * 옆면이 A와 B인 직사각형의 면적은 A * B이고 둘레는 2 * (A + B)이다.
 *
 * 목표는 면적이 N인 직사각형의 최소 둘레를 찾는 것이다. 이 직사각형의 측면은 정수로만 되어야 한다.
 *
 * 예를 들어 정수 N = 30인 경우 영역 30의 직사각형은 다음과 같다.
 *
 * (1,30), 둘레 62
 * (2, 15), 둘레 34
 * (3, 10), 둘레 26
 * (5, 6), 둘레 22.
 * 함수 쓰기:
 *
 * class Solution { public int 솔루션(Nint N), }
 *
 * 정수 N이 주어진 경우 면적이 N과 정확히 동일한 직사각형의 최소 둘레를 반환한다.
 *
 * 예를 들어 정수 N = 30인 경우 함수는 위에서 설명한 대로 22를 반환해야 한다.
 *
 * 다음과 같은 가정에 대해 효율적인 알고리즘을 작성하십시오.
 *
 * N은 [1 ~1,000,000,000] 범위 내의 정수다.
 *
 */
public class MinPerimeterRectangle {

    public int solution(int N) {
        // N의 약수 구하기
        int max = 1;
        for (int i=1; i<=Math.sqrt(N); i++) {
            if(N % i == 0 && max < i){
                max = i;
            }
        }
        // N의 약수 중에서 차이가 가장 작은 쌍의 둘레값 계산해서 반환
        return (N / max + max) * 2;
    }

    public static void main(String[] args) {
        System.out.println(new MinPerimeterRectangle().solution(2));
    }
}
