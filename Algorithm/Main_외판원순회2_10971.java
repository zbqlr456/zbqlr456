import java.util.*;
import java.io.*;

public class Main_외판원순회2_10971 {
    static int n, map[][], answer;
    static boolean visit[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        map = new int[n+1][n+1];
        visit = new boolean[n+1];
        answer = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }//input

        for(int i = 1; i <= n; i++) {
            visit[i] = true;//visit체크 - 시작 (1,1)
            dfs(i, i, 0);
            visit[i] = false;
        }

        System.out.println(answer);
    }

    public static void dfs(int start, int line, int sum) {
        boolean finish = true;// 도착.

        for(int i = 1; i <= n; i++)
            if(!visit[i]) // 하나라도 visit하지 않았다면
                finish = false;// 도착취소!

        if(finish && map[line][start] != 0) {//모든 곳을 다 들렸고, 마지막까지 이어져있으면
            answer = Math.min(answer, sum+map[line][start]); //현재의 최단거리와 여태까지 온 거리중에 거리가 더 적은 곳이 최단거리.
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(map[line][i] != 0 && !visit[i]) {//line과 i가 이어져있고 들리지 않은 곳이면
                visit[i] = true;//들렸다고 체크
                dfs(start, i, sum + map[line][i]);//같은 곳 들리고 n만큼 순회하면서 길이를 더해간다.
                visit[i] = false;//나오면서 다시 visit을 alse 체크
            }
        }
    }
}