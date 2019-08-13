package codility;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PassingCar {

    public int solution(int[] A){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<A.length; i++){
            stack.add(A[i]);
        }

        int res = 0;
        int sum = 0;
        while(!stack.isEmpty()){
            int tgt = stack.pop();
            if(tgt == 1) sum++;
            else res+= sum;
        }

        if(res > 1000000000 || res < -1000000000) return -1;
        else return res;
    }

    public static void main(String[] args) {

        PassingCar passingCar = new PassingCar();
        System.out.println(passingCar.solution(new int[]{0,1,0,1,1}));
    }
}
