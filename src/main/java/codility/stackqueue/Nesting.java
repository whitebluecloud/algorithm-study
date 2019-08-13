package codility.stackqueue;

import org.junit.Test;

import java.util.Stack;

public class Nesting {

    public int solution(String s){

        int answer = 1;
        Stack<Character> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        for(int i=0; i<sArr.length; i++){
            if('(' == sArr[i]){
                stack.push('(');
            }else{
                if(stack.size() == 0){
                    return 0;
                }else{
                    stack.pop();
                }
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }


    public static void main(String[] args) {
        Nesting nesting = new Nesting();
        System.out.println(nesting.solution("(()(())())"));
        System.out.println(nesting.solution("())"));

    }
}
