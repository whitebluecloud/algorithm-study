package programmers.fullsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exam {

    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] first = new int[]{1, 2, 3, 4, 5};
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;

        if(first[0] == answers[0]) firstCnt++;
        if(second[0] == answers[0]) secondCnt++;
        if(third[0] == answers[0]) thirdCnt++;

        for(int i=1; i<answers.length; i++){
            if(answers[i] == first[i % first.length]) firstCnt++;
            if(answers[i] == second[i % second.length]) secondCnt++;
            if(answers[i] == third[i % third.length]) thirdCnt++;
        }

        int max = Math.max(Math.max(firstCnt,secondCnt), thirdCnt);
        ArrayList<Integer> result = new ArrayList<>();
        if(firstCnt == max){
            result.add(1);
        }
        if(secondCnt == max){
            result.add(2);
        }
        if(thirdCnt == max) {
            result.add(3);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new exam().solution(new int[]{1,2,3,4,5}));
    }
}
