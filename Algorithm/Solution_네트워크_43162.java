import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
       
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            queue.offer(i);
            visited[i] = true;
            while(!queue.isEmpty()){
                int tmp = queue.poll();
                for(int j=0;j<n;j++){
                    if(!visited[j] && computers[tmp][j] == 1){
                        queue.offer(j);
                        visited[j] = true;
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
}