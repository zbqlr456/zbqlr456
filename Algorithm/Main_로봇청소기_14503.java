import java.util.*;
import java.io.*;

public class Main_로봇청소기_14503 {
    static int N, M, r, c, d, cnt = 0;
    static int[][] map;
    static boolean[][] visited;
    static int[] di = {-1,0,1,0};
    static int[] dj = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0; m < M; m++) {
                map[n][m] = Integer.parseInt(st.nextToken());
            }
        }
        // Input

        // 각각의 칸은 벽 or 빈칸
        // 청소기는 바라보는 방향 있음
        // 동1 서3 남2 북0 바라봄 3 2 1 0 3 2 1 0 3 2 1 0
        // 지도 북쪽에서부터 r번째, 서쪽에서부터 c번째
        // 1. 현재 위치를 청소한다
        // 2. 현재 위치에서 바로 왼쪽에 아직 청소하지 않은 빈공간이 존재한다면, 왼쪽방향으로 회전한다음 한칸 전진하고 청소한다.
        // 3. 현재 위치에서 바로 왼쪽의 공간이 청소된 공간기거나 빈공간이 아니면, 왼쪽방향으로 회전만 한다.
        // 4. 왼쪽으로 방향 전환을 4번해서 원래 상태로 돌아왔을 때 뒤쪽이 벽이면 끝, 아니면 후진


        dfs(r, c, d);

        System.out.println(cnt);
    }

    private static void dfs(int r, int c, int d) {
        if (map[r][c] == 0 && !visited[r][c]) {
            visited[r][c] = true;
            cnt++;
        }

        for(int dir = d;dir>d-4;dir--){
            if(dir<=0)
                dir+=4;
            if(map[r+di[dir-1]][c+dj[dir-1]] == 1 || visited[r+di[dir-1]][c+dj[dir-1]])
                continue;
            dfs(r+di[dir-1],c+dj[dir-1],dir-1);
        }

    }
}
