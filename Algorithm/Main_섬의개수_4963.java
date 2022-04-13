import java.io.*;
import java.util.*;

public class Main_섬의개수_4963 {

    static int w,h;
    static int[][] map;
    static boolean[][] visit;
    static int[] di = {-1,-1,-1,0,0,1,1,1};
    static int[] dj = {-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while(true) {
            int cnt=0;
            st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(h==0 && w==0) break;

            map = new int[h][w];
            visit = new boolean[h][w];

            for(int i = 0;i<h;i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0;i<h;i++) {
                for(int j=0;j<w;j++) {
                    if(map[i][j]==1 && !visit[i][j]) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
    static void dfs(int si, int sj) {
        visit[si][sj] = true;

        for(int d=0;d<8;d++) {
            int ni = si+ di[d];
            int nj = sj+ dj[d];
            if(ni < 0 || ni>=h || nj<0 || nj>=w || visit[ni][nj])
                continue;
            if(map[ni][nj]==1)
                dfs(ni,nj);
        }

    }
}
