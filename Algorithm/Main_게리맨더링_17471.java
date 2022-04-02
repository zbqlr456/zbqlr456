import java.util.*;
import java.io.*;

public class Main_게리맨더링_17471 {

    static int N,min = Integer.MAX_VALUE;
    static int cnt101,cnt102;
    static int[][] map;
    static int[] pop;
    static int[] team;
    static boolean[] check;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        N = Integer.parseInt(br.readLine());

        map = new int[N+1][N+1];
        pop = new int[N+1];
        team = new int[N+1];
        check = new boolean[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<N+1;i++) {
            pop[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<N+1;i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            for(int j=0;j<tmp;j++) {
                map[i][Integer.parseInt(st.nextToken())] = 1;
            }
        }//input

        subset(1);

        System.out.println(min);
    }
    static void subset(int target) {

        if(target == team.length) {
            int sum101 =0;
            int sum102 =0;

            cnt101=0;
            cnt102=0;

            //101인 애들과 -101인 애들이 끼리끼리 잘 연결되어있는지 확인하기.
            //team에서 for문 돌면서 101인 애를 발견한다.check[true]하고 cnt++
            for(int i=1;i<=team.length;i++) {
                if(team[i] == 101) {
                    check[i] = true;
                    cnt101++;
                    find(i);
                }
            }

            int tmp=0;
            for(int i=1;i<=team.length;i++) {
                if(team[i] == 101) {
                    tmp++;
                }
            }
            if(tmp!=cnt101) return;

            for(int i=1;i<=team.length;i++) {
                if(team[i] == 101) {
                    sum101+=pop[i];
                }
                if(team[i] == 102) {
                    sum102+=pop[i];
                }
            }
            if(Math.abs(sum101-sum102)<min) min = Math.abs(sum101-sum102);

            //map에서 101인 애의 행을 살펴본다.
            //map의 해당 행에서 1인애를 찾는다. check[true]면 continue;
            //걔의 team인덱스가 101이면 check[true]하고 cnt++
            //걔의 map 행으로 간다.
            //없을때까지 반복.
            //잘 연결되어있다면 101인애들 인구 더하고, -101인 애들 인구 더해서 뺀다음 절대값처리하고,
            //min보다 작으면 min에 넣어준다.
        }

        team[target] = 101;
        subset(target+1);
        team[target] = 102;
        subset(target+1);

    }
    static void find(int start) {

        for(int j=1;j<=N;j++) {
            if(map[start][j] == 1 && team[j]==101 && !check[j]) {
                find(j);
                check[j] = true;
                cnt101++;
            }
        }
    }
}
