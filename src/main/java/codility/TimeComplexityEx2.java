package codility;

public class TimeComplexityEx2 {
    public int solution(int[] A) {

        int len = A.length;

        int sum = 0;
        for(int i=1; i<len+2; i++){
            sum += i;
        }
        int sum2 = 0;
        for(int i=0; i<len; i++){
            sum2 += A[i];
        }
        return sum - sum2;
    }

    public static void main(String[] args) {
        TimeComplexityEx2 timeComplexityEx2 = new TimeComplexityEx2();
        timeComplexityEx2.solution(new int[]{2,3,1,5});
    }
}
