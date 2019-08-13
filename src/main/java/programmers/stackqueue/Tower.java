package programmers.stackqueue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tower {

    public static int[] solution(int[] heights) {

        int[] answer = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    answer[j] = i + 1;
                }
            }
        }
        return answer;
    }

    @Test
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6,9,5,7,4}));
//        Assert.assertEquals(solution(new int[]{6,9,5,7,4}), new int[]{0,0,2,2,4});

//        [3,9,9,3,5,7,2]	[0,0,0,3,3,3,6]
//        [1,5,3,6,7,6,5]	[0,0,2,0,0,5,6]
    }
}
