package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Kakaocode1 {

    public int solution(int m, int n, int[][] picture){

        int[][] checkMap = new int[m][n];

        Arrays.fill(checkMap, -1);

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0,0,picture[0][0]));

        int lowestVal = Integer.MAX_VALUE;
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
            int cnt = 0;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    int val = picture[i][j];
                    if(checkMap[i][j] == -1){
                        checkMap[i][j] = val;
                    }

                    if(currentNode.val == val){
                        cnt++;
                    }else{

                    }

                    if(picture[i][j] == 0){
                        continue;
                    }
                }
            }
        }

        return 0;
    }

    public class Node{
        private int x;
        private int y;
        private int val;

        public Node(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }

    }
}

/*
    m	n	picture	answer
6	4	[[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]	[4, 5]
 */