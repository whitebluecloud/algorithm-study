package programmers.stackqueue;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.LinkedList;
import java.util.Queue;

public class Stick {

    public static void main(String[] args) {
        solution("()(((()())(())()))(())");
    }

    private static int solution(String s) {

        int leftCnt = 0;
        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            queue.add(s.charAt(i));
        }
        int sum = 0;
        boolean prevIsLeft = false;
        while(!queue.isEmpty()){
            switch(queue.poll()){
                case '(':
                    leftCnt++;
                    prevIsLeft = true;
                    break;
                case ')':
                    if(prevIsLeft){
                        leftCnt--;
                        prevIsLeft = false;
                        sum += leftCnt;
                    }else{
                        sum += 1;
                        leftCnt--;
                    }
                    break;
                default:
                    break;
            }
        }
        return sum;
    }
}
