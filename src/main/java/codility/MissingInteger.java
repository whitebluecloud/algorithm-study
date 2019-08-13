package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.stream.Collectors;

// hashset 생각은했는데...적용을 못했네.. ㅎ ㅏ
public class MissingInteger {

    public int solution(int[] A){
        int max = Arrays.stream(A).max().getAsInt();
        if(max < 1) return 1;
        int[] data = Arrays.stream(A).distinct().sorted().toArray();

        int before = data[0];
        boolean oneCheck = false;
        for(int i=0; i<data.length; i++){
            if(data[i]<=0) continue;
            if(data[i]==1){
                if(i == data.length-1) return 2;
                before = 1;
                oneCheck = true;
            }
            if(data[i]>1){
                if(oneCheck == false) return 1;
                if(data[i] != before + 1){
                    return before + 1;
                }else{
                    if(i == data.length-1) return data[i]+1;
                    before = data[i];
                }
            }
        }

        return 1;
    }


    public int solution2(int[] A){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<A.length; i++){
            hashSet.add(A[i]);
        }

        for(int i=1; i<Integer.MAX_VALUE; i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }
        return 1;
    }


    public static void main(String[] args) {

    }
}
